package JavaConcurrent.Chapter3;

import com.sun.javafx.font.t2k.T2KFactory;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author KiroScarlet
 * @date 2019-03-25  -10:19
 */
public class TimeLock implements Runnable {
    public static ReentrantLock lock = new ReentrantLock();
    @Override
    public void run() {
        try {
            if (lock.tryLock(5, TimeUnit.SECONDS)) {
                Thread.sleep(6000);
            } else {
                System.out.println("get Lock failed");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            if (lock.isHeldByCurrentThread()) {
                lock.unlock();
            }
        }
    }

    public static void main(String[] args) {
        TimeLock t1 = new TimeLock();
        Thread thread1 = new Thread(t1);
        Thread thread2 = new Thread(t1);
        thread1.start();
        thread2.start();
    }
}
