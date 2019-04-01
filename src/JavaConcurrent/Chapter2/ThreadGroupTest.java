package JavaConcurrent.Chapter2;

/**
 * @author KiroScarlet
 * @date 2019-03-24  -22:43
 */
public class ThreadGroupTest implements Runnable {
    public static void main(String[] args) {
        ThreadGroup tg = new ThreadGroup("PrintGroup");//建立线程组
        Thread t1 = new Thread(tg, new ThreadGroupTest(), "T1");//创建线程时指定所属的线程组
        Thread t2 = new Thread(tg, new ThreadGroupTest(), "T2");
        t1.start();
        t2.start();
        System.out.println(tg.activeCount());//获得活动线程的总数
        tg.list();
    }
    @Override
    public void run() {
        String groupAndName = Thread.currentThread().getThreadGroup().getName() +
                "-" + Thread.currentThread().getName();
        while (true) {
            System.out.println("i'm " + groupAndName);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
