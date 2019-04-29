package CoreJava.CoreJava1.Chapter3;

import java.util.Arrays;

/**
 * @author KiroScarlet
 * @date 2019-04-29  -17:27
 */
public class ArrayTest {
    public static void main(String[] args) {
        int[] a = {12, 2, 13, 4};
        int[] b = Arrays.copyOf(a, a.length - 2);
        System.out.println(Arrays.toString(b));
        int[] c = Arrays.copyOfRange(a, 2, 3);
        System.out.println(Arrays.toString(c));
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));

        /**
         [12, 2]
         [13]
         [2, 4, 12, 13]
         */
    }
}
