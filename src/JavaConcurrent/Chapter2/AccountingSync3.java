package JavaConcurrent.Chapter2;

/**
 * @author KiroScarlet
 * @date 2019-03-24  -23:12
 */
public class AccountingSync3 implements Runnable {
    static int i=0;

    public static synchronized void increase() {
        i++;
    }
    @Override
    public void run() {
        for (int j = 0; j < 100000; j++) {
            increase();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new AccountingSync3());//注意，只用对当前类加锁后才能使用这种方式
//        因为如果只是对方法加锁时t1和t2线程指向了不同的对象实例。

        Thread t2 = new Thread(new AccountingSync3());
        t1.start();t2.start();
        t1.join();t2.join();
        System.out.println(i);
    }
}