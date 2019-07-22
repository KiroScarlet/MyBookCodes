package test;

import org.junit.Test;

/**
 * @author KiroScarlet
 * @date 2019-06-11  -9:29
 */
public class StringTest {
    public static void main(String[] args) {
    }

    @Test
    public void test1() {
        String s = "1111";
        System.out.println(s);
        char[] chars = {'1', 's', 'a'};
        String s1 = new String(chars);
        System.out.println(s1);
    }
}
