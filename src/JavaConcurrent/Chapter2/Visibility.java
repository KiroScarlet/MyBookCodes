package JavaConcurrent.Chapter2;

/**
 * @author KiroScarlet
 * @date 2019-03-24  -22:33
 */
public class Visibility {
    private static volatile boolean ready;//如果不使用volatile关键字，那么ReaderThread线程无法看到主线程的修改，导致eaderThread线程永远无法退出
    private static int number;

    private static class ReaderThread extends Thread {
        @Override
        public void run() {
            while (!ready);
            System.out.println(number);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        new ReaderThread().start();
        Thread.sleep(1000);
        number=42;
        ready = true;
        Thread.sleep(1000);
    }
}
