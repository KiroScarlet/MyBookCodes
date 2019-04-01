package JavaConcurrent.Chapter3;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author KiroScarlet
 * @date 2019-03-25  -14:03
 */
public class ReenterLockCondition implements Runnable {
    public static ReentrantLock lock = new ReentrantLock();
    //通过newCondition方法生成一个与当前重入锁绑定的Condition实例。
    public static Condition condition = lock.newCondition();

    @Override
    public void run() {

        try {
            lock.lock();
            //await方法会使当前线程等待在Condition上，同时释放当前锁
            condition.await();
            System.out.println("Thread is going on");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ReenterLockCondition reenterLockCondition = new ReenterLockCondition();
        Thread thread = new Thread(reenterLockCondition);
        thread.start();
        Thread.sleep(2000);
        //在signal方法调用时，要求线程先获得相关的锁
        lock.lock();
        //调用signal方法，系统会从当前Condition对象的等待队列中唤醒一个线程
        //同理，signalAll方法会唤醒所有线程
        condition.signal();
        //在signal方法调用后，需要释放相关的锁，让给被唤醒的线程
        //若没有释放锁，线程thread无法继续执行
        lock.unlock();
    }
}
