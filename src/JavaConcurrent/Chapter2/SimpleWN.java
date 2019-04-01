package JavaConcurrent.Chapter2;

/**
 * @author KiroScarlet
 * @date 2019-03-30  -14:00
 */
public class SimpleWN {
    final static Object object = new Object();

    public static class T1 extends Thread {
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


    public static class T2 extends Thread {
        @Override
        public void run() {
            synchronized (object) {
                System.out.println(System.currentTimeMillis() + ":T2 start!notify one thread");

                object.notify();
                System.out.println(System.currentTimeMillis()+":T2 end!");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        Thread t1 = new T1();
        Thread t2 = new T2();
        t1.start();t2.start();
    }
}
