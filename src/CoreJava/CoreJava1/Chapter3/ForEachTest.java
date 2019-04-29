package CoreJava.CoreJava1.Chapter3;

/**
 * @author KiroScarlet
 * @date 2019-04-29  -17:24
 */
public class ForEachTest {
    public static void main(String[] args) {
        int[] a = new int[10];
        for (int i = 0; i < 10; i++) {
            a[i] = i;
        }
        for (int element : a) {
            System.out.println(element);
        }
    }
}
