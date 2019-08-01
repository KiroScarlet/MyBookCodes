package JavaGuide.javabasis;

import org.junit.Test;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

/**
 * @author KiroScarlet
 * @date 2019-07-22  -22:26
 * @desc 正确使用equals
 */
public class EqualsTest {
    @Test
    public void test1() {

//        float a = 1.0f - 0.9f;
//        float b = 0.9f - 0.8f;
//        System.out.println(a);// 0.100000024
//        System.out.println(b);// 0.099999964
//        System.out.println(a == b);// false

        BigDecimal a = new BigDecimal("1.0");
        BigDecimal b = new BigDecimal("0.9");
        BigDecimal c = new BigDecimal("0.8");
        BigDecimal x = a.subtract(b);// 0.1
        BigDecimal y = b.subtract(c);// 0.1
        System.out.println(x.equals(y));// true

        BigDecimal m = new BigDecimal("1.255833");
        BigDecimal n = m.setScale(3, BigDecimal.ROUND_HALF_DOWN);
        System.out.println(n);

        String[] myArray = {"Apple", "Banana", "Orange"};
        List<String> myList = Arrays.asList(myArray);
    }
}
