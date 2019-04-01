package JavaConcurrent.Chapter3;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author KiroScarlet
 * @date 2019-03-25  -9:44
 */
public class ReenterLock implements Runnable {
    public static ReentrantLock lock = new ReentrantLock();
    public static int i=0;
    @Override
    public void run() {
        for (int j = 0; j < 100000; j++) {
            lock.lock();
            try {
                i++;
            }finally {
                lock.unlock();
            }
        }
    }
}
