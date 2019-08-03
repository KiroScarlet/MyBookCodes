package NewCoderSolution.real2019;

import java.util.Scanner;

/**
 * @author KiroScarlet
 * @date 2019-08-02  -16:29
 * @title Real2019002
 * @project MyBookCodes
 * @desc 被3整除
 */
public class Real2019002 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int left = in.nextInt();
        int right = in.nextInt();

        long number = 0;

        long sub = 0;
        //第几个数就是多少个自然数的组合

        //注意！利用逐个数字用等差数列公式求和的方法没有错误，
        // 但是关键的是利用的类型不能是int,因为可能中途求和的结果会超出 int 类型的最大长度，使用long 就可以通过所有测试用例。
        for (long i = left; i <= right; i++) {
            sub = i * (1 + i) / 2;
            if (sub % 3 == 0) {
                number++;
            }
        }
        System.out.println(number);
    }
}
