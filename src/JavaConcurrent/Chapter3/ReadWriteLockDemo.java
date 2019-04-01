package JavaConcurrent.Chapter3;

import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @author KiroScarlet
 * @date 2019-03-25  -15:14
 */
public class ReadWriteLockDemo {
//    private static Lock lock = new ReentrantLock();
    private static ReentrantReadWriteLock readWriteLock = new ReentrantReadWriteLock();
    private static Lock readLock = readWriteLock.readLock();    //读取锁
    private static Lock writeLock = readWriteLock.writeLock();  //写入锁
    private int value;

    public Object handleRead(Lock lock) throws InterruptedException {
        try {
            lock.lock();               //模拟读操作
            Thread.sleep(1000);  //读操作的耗时越多，读写锁的优势就越明显
            return value;
        }finally {
            lock.unlock();
        }
    }


    public void handleWrite(Lock lock, int index) throws InterruptedException {
        try {
            lock.lock();               //模拟写操作
            Thread.sleep(1000);  //写操作的耗时越多，读写锁的优势就越明显
            value = index;
        }finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        final ReadWriteLockDemo demo = new ReadWriteLockDemo();
        Runnable readRunable=new Runnable() {
            @Override
            public void run() {
                try {
                    demo.handleRead(readLock);
//                    demo.handleRead(lock);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Runnable writeRunable =new Runnable() {
            @Override
            public void run() {
                try {
                    demo.handleWrite(writeLock,new Random().nextInt());
//                    demo.handleWrite(lock, new Random().nextInt());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        for (int i = 0; i < 18; i++) {
            new Thread(readRunable).start();
        }
        for (int i = 18; i < 20; i++) {
            new Thread(writeRunable).start();
        }
    }
}
