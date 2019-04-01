package JavaConcurrent.Chapter3;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @author KiroScarlet
 * @date 2019-03-26  -16:01
 */
public class ScheduledExecutorServiceDemo {
    public static void main(String[] args) {
        ScheduledExecutorService ses = Executors.newScheduledThreadPool(10);
        //如果前面的调度没有完成，那么调度不会启动,也就是说，如果任务执行时间大于间隔时间，在上一个任务执行完成后就会紧接着执行下一个任务
        //而如果使用ses.scheduleWithFixedDelay()方法，那么在上一个任务完成后会在固定的间隔时间之后开始下一个任务
        ses.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1000);
                    System.out.println(System.currentTimeMillis()/1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        },0,2,TimeUnit.SECONDS);
    }
}
