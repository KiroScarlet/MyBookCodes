package JavaConcurrent.Chapter2;

/**
 * @author KiroScarlet
 * @date 2019-03-24  -23:12
 */
public class AccountingSync2 implements Runnable {
    static AccountingSync instance = new AccountingSync();
    static int i=0;

    public synchronized void increase() {
        i++;
    }
    @Override
    public void run() {
        for (int j = 0; j < 100000; j++) {
            increase();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(instance);
        Thread t2 = new Thread(instance);
        t1.start();t2.start();
        t1.join();t2.join();
        System.out.println(i);
    }
}