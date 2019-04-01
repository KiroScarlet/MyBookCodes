package JavaConcurrent.Chapter2;

/**
 * @author KiroScarlet
 * @date 2019-03-30  -13:47
 */
public class InterruptTest {

    public static void main(String[] args) throws InterruptedException {
        Thread t1=new Thread(){
            @Override
            public void run() {
                while (true) {
                    if (Thread.currentThread().isInterrupted()) {
                        System.out.println("Interruted!");
                        break;
                    }
                    Thread.yield();
                }
            }
        };
        t1.start();
        t1.interrupt();
    }
}
