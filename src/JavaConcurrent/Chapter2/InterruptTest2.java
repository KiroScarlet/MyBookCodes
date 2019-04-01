package JavaConcurrent.Chapter2;

/**
 * @author KiroScarlet
 * @date 2019-03-30  -13:47
 */
public class InterruptTest2 {

    public static void main(String[] args) throws InterruptedException {
        Thread t1=new Thread(){
            @Override
            public void run() {
                while (true) {
                    if (Thread.currentThread().isInterrupted()) {
                        System.out.println("Interruted!");
                        break;
                    }
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        System.out.println("Interruted When Sleep");
                        Thread.currentThread().interrupt();
                    }
                    Thread.yield();
                }
            }
        };
        t1.start();
        Thread.sleep(2000);
        t1.interrupt();
    }
}
