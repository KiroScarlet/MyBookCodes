package JavaConcurrent.Chapter4;

import java.util.concurrent.atomic.AtomicIntegerArray;

/**
 * @author KiroScarlet
 * @date 2019-04-02  -13:33
 */
public class AtomicIntegerArrayDemo {
    static AtomicIntegerArray array = new AtomicIntegerArray(10);

    public static class AddThread implements Runnable {

        @Override
        public void run() {
            //对数组内10个元素每个累加1000次
            for (int i = 0; i < 10000; i++) {
                array.getAndIncrement(i % array.length());
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        //创建10个线程
        Thread[] ts = new Thread[10];
        for (int i = 0; i < 10; i++) {
            ts[i] = new Thread(new AddThread());
        }
        for (int i = 0; i < 10; i++) {
            ts[i].start();
        }
        for (int i = 0; i < 10; i++) {
            ts[i].join();
        }
        System.out.println(array);
    }
}
