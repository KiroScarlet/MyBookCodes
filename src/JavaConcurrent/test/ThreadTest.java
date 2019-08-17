package JavaConcurrent.test;

import JavaConcurrent.Chapter2.myThread1;
import JavaConcurrent.Chapter2.myThread2;
import JavaConcurrent.Chapter2.myThread3;
import org.junit.Test;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @author KiroScarlet
 * @date 2019-08-12  -15:54
 * @title ThreadTest
 * @project MyBookCodes
 * @desc TODO
 */
public class ThreadTest {
    @Test
    public void test() throws ExecutionException, InterruptedException {
        Thread thread1 = new myThread1();
        Thread thread2 = new Thread(new myThread2());

        FutureTask<String> futureTask = new FutureTask<>(new myThread3());
        Thread thread3 = new Thread(futureTask);
        thread3.start();
        System.out.println(futureTask.get());
    }


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

class MyThread1 extends Thread {
    @Override
    public void run() {
        System.out.println("hello,myThread1");
    }
}

class MyThread2 implements Runnable {

    @Override
    public void run() {
        System.out.println("hello,MyThread2");
    }
}

class MyThread3 implements Callable<String> {

    @Override
    public String  call() throws Exception {
        return "hello";
    }

}