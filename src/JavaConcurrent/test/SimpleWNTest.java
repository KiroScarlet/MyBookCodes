package JavaConcurrent.test;

import java.util.Objects;

/**
 * @author KiroScarlet
 * @date 2019-08-12  -16:31
 * @title SimpleWNTest
 * @project MyBookCodes
 * @desc TODO
 */
public class SimpleWNTest {
    final static Object object = new Object();

    public static class T1 implements Runnable {
        @Override
        public void run() {
            synchronized (object) {
                System.out.println(System.currentTimeMillis() + ":T1 start!");
                try {
                    System.out.println(System.currentTimeMillis()+":T1 wait for object");
                    object.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            System.out.println(System.currentTimeMillis()+":T1 end!");
        }
    }

    public static class T2 implements Runnable {
        @Override
        public void run() {
            synchronized (object) {
                System.out.println(System.currentTimeMillis() + ":T2 start!");

                object.notify();
                System.out.println(System.currentTimeMillis() + ":T2 end!");

                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new T1());
        Thread t2 = new Thread(new T2());
        t1.start();
        t2.start();
    }


}
