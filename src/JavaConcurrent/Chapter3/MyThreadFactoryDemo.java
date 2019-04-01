package JavaConcurrent.Chapter3;

import java.util.concurrent.*;

/**
 * @author KiroScarlet
 * @date 2019-03-30  -23:22
 */
public class MyThreadFactoryDemo {

    public static class MyTask implements Runnable {
        @Override
        public void run() {
            System.out.println(System.currentTimeMillis() + ":Thread ID:" + Thread.currentThread().getId());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        MyTask task = new MyTask();
        ExecutorService es = new ThreadPoolExecutor(5, 5,
                0L, TimeUnit.MILLISECONDS,
                new SynchronousQueue<Runnable>(),
                new ThreadFactory() {
                    @Override//自定义线程工厂
                    public Thread newThread(Runnable r) {
                        Thread t = new Thread(r);
                        t.setDaemon(true);
                        System.out.println("create " + t);
                        return t;
                    }
                });

        for (int i = 0; i < 5; i++) {
            es.submit(task);
        }

        Thread.sleep(2000);
    }
}
