package JavaConcurrent.Chapter2;

/**
 * @author KiroScarlet
 * @date 2019-03-24  -23:06
 */
public class AccountingSync implements Runnable {
    static AccountingSync instance = new AccountingSync();
    static int i=0;

    @Override//将关键字synchronized作用于一个给定对象instance
             //因此，每次线程进入被关键字synchronized包裹的代码段时，就会请求instance实例的锁。
    public void run() {
        for (int j = 0; j < 100000; j++) {
            synchronized (instance) {
                i++;
            }
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
