package CoreJava.CoreJava1.Chapter8;

/**
 * @author KiroScarlet
 * @date 2019-03-05  -16:27
 */
public class PairTest2 {
    public static void main(String[] args) {
        String middle = ArrayAlg1.getMIddle("john", "Q.", "public");
        System.out.println(middle);
        double middle2 = ArrayAlg1.getMIddle(3.14, 1729.1, 0.2);
    }
}


class ArrayAlg1 {
    public static <T> T getMIddle(T... a) {
        return a[a.length / 2];
    }
}