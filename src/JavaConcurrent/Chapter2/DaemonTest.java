package JavaConcurrent.Chapter2;

/**
 * @author KiroScarlet
 * @date 2019-03-24  -22:50
 */
public class DaemonTest {
    public static class myDaemon extends Thread {
        @Override
        public void run() {
            while (true) {
                System.out.println("I am alive");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread t = new myDaemon();
        t.setDaemon(true);//把线程设置为守护线程，必须在start()之前
        t.start();

        Thread.sleep(2000);
    }
}
