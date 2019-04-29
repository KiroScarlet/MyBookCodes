package CoreJava.CoreJava1.Chapter3;

import java.math.BigInteger;

/**
 * @author KiroScarlet
 * @date 2019-04-29  -17:21
 */
public class BigIntegerTest {
    public static void main(String[] args) {
        BigInteger a = BigInteger.valueOf(100);
        BigInteger b = a.add(BigInteger.valueOf(200));
        System.out.println(b.toString());
    }
}
