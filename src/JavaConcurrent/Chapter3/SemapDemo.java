package JavaConcurrent.Chapter3;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/**
 * @author KiroScarlet
 * @date 2019-03-25  -14:34
 */
public class SemapDemo implements Runnable {
    //声明一个包含5个许可的信号量
    final Semaphore semp = new Semaphore(5);

    @Override
    public void run() {
        try {
            //申请信号量
            semp.acquire();
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getId()+":done!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            //离开前要释放信号量
            semp.release();
        }
    }

    public static void main(String[] args) {
        ExecutorService exec = Executors.newFixedThreadPool(20);
        final SemapDemo demo = new SemapDemo();
        //同时开启20个线程，但每次只能有5个线程进行输出
        for (int i = 0; i < 20; i++) {
            exec.submit(demo);
        }
    }
}


/*
//信号量的构造函数，构造时必须制定准入数，即同时能申请多少个许可
public Semaphore(int permits)
public Semaphore(int permits,boolean fair)  //第二个参数可以指定是否公平

//信号量的方法
public void acquire()  //尝试获得一个准入许可
public void acquireUninterruptibly()  //不响应中断
public boolean tryAcquire()  //尝试获得一个许可，成功返回true，失败返回false，不等待
public boolean tryAcquire(long timeout, TimeUnit unit)  //等待限时
public void release()  //用于访问结束后释放一个许可
*/
