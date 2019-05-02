package CoreJava.CoreJava1.Chapter6;

import java.util.function.IntConsumer;

/**
 * @author KiroScarlet
 * @date 2019-05-02  -21:38
 */
public class RepeatTest {
    public static void repeat(int n, Runnable action) {
        for (int i = 0; i < n; i++) {
            action.run();
        }
    }

    public static void repeat2(int n, IntConsumer action) {
        for (int i = 0; i < n; i++) {
            action.accept(i);
        }
    }

    public static void main(String[] args) {
        RepeatTest.repeat(10,()-> System.out.println("hello world!"));
        RepeatTest.repeat2(10,i-> System.out.println(i));
//        RepeatTest.repeat2(10,System.out::println);
    }


}
