package JavaConcurrent.Chapter2;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @author KiroScarlet
 * @date 2019-03-24  -17:11
 */
public class myThread3 implements Callable<String> {
    @Override
    public String call() throws Exception {
        return "hello";
    }

    public static void main(String[] args) {
        FutureTask<String> future = new FutureTask<>(new myThread3());
        Thread t3 = new Thread(future);
        t3.start();
        try {
            System.out.println(future.get());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
