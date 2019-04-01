package JavaConcurrent.Chapter4;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author KiroScarlet
 * @date 2019-04-01  -21:32
 */
public class ThreadLocalDemo {

    static ThreadLocal<SimpleDateFormat> t1 = new ThreadLocal<>();
//    private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-ddHH:mm:ss");

    public static class parseDate implements Runnable {

        int i=0;

        public parseDate(int i) {
            this.i = i;
        }

        @Override
        public void run() {
            try {
                if (t1.get() == null) {
                    t1.set(new SimpleDateFormat("yyyy-MM-ddHH:mm:ss"));
                }
                Date date = t1.get().parse("2019-04-01 19:29:" + i % 60);
                System.out.println(i+":"+date);
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(10);
        for (int i = 0; i < 1000; i++) {
            es.execute(new parseDate(i));
        }
    }
}
