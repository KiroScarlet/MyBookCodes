package JavaConcurrent.Chapter2;

/**
 * @author KiroScarlet
 * @date 2019-03-24  -17:14
 */
public class myThread2 implements Runnable {
    public static void main(String[] args) {
        Thread t2 = new Thread(new myThread2());
        t2.start();
    }

    @Override
    public void run() {
        System.out.println("hello");
    }
}
