package JavaGuide.javaconcurrent;

import java.text.SimpleDateFormat;
import java.util.Random;

/**
 * @author KiroScarlet
 * @date 2019-08-01  -21:15
 * @title ThreadLocalExample
 * @project MyBookCodes
 * @desc TODO
 */
public class ThreadLocalExample implements Runnable {

    //SimpleDateFormat不是线程安全的，所以每个线程都要有自己独立的副本
    private static final ThreadLocal<SimpleDateFormat> formatter =
            ThreadLocal.withInitial(() -> new SimpleDateFormat("yyyyMMdd HHmm"));

    public static void main(String[] args) throws InterruptedException {
        ThreadLocalExample obj = new ThreadLocalExample();
        for (int i = 0; i < 10; i++) {
            Thread t = new Thread(obj, "" + i);
            Thread.sleep(new Random().nextInt(1000));
            t.start();
        }
    }

    @Override
    public void run() {
        System.out.println("Thread name= " + Thread.currentThread().getName() +
                " default Formatter = " + formatter.get().toPattern());
        try {
            Thread.sleep(new Random().nextInt(1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //改变formatter的值，但是并不会改变其他线程中的值
        formatter.set(new SimpleDateFormat());
        System.out.println("Thread name= " + Thread.currentThread().getName() +
                " default Formatter = " + formatter.get().toPattern());

    }
}
