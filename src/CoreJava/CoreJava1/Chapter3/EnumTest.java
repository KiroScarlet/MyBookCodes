package CoreJava.CoreJava1.Chapter3;

/**
 * @author KiroScarlet
 * @date 2019-04-29  -15:24
 */
public class EnumTest {

    public enum  Size {
        SMALL,MEDIUM,LARGE,EXTRA_LARGE;
    }
    public static void main(String[] args) {
        Size s = Size.MEDIUM;
        System.out.println(s);
        for (Size size : Size.values()) {
            System.out.println(size);
        }

        for (int i = 0; i < Size.values().length; i++) {
            System.out.println(Size.values()[i]);
        }
    }
}
