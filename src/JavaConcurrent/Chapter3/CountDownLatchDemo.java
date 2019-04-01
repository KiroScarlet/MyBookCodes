package JavaConcurrent.Chapter3;

import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author KiroScarlet
 * @date 2019-03-25  -15:46
 */
public class CountDownLatchDemo implements Runnable {
    //创建一个倒计数器的实例，参数为计数器的计数个数
    //参数为10表示需要10个线程完成任务后等待在CountDownLatch上的线程才能继续执行
    static final CountDownLatch end = new CountDownLatch(10);
    static final CountDownLatchDemo demo = new CountDownLatchDemo();

    @Override
    public void run() {
        try {
            //模拟线程执行时间
            Thread.sleep(new Random().nextInt(10)*1000);
            System.out.println("check complete");
            //一个线程已经完成了任务，倒计数器减一
            end.countDown();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ExecutorService exec = Executors.newFixedThreadPool(10);
        for (int i = 0; i < 10; i++) {
            exec.submit(demo);
        }
        //要求主线程等待所有检查任务全部完成后，才能继续执行
        end.await();
        System.out.println("go!");
        exec.shutdown();
    }
}
