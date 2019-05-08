package test;

/**
 * @author KiroScarlet
 * @date 2019-05-05  -22:25
 */
public class BaseTest {
    int w, x, y, z;

    public BaseTest(int a, int b) {
        x = a;
        y = b;
    }

    public BaseTest(int a, int b, int c, int d) {
//        new BaseTest(a, b);
        this(a, b);
        w = d;
        z = c;
    }
}
