package NewCoderSolution.real2019.tengxun;

import java.util.Scanner;

/**
 * @author KiroScarlet
 * @date 2019-08-17  -19:37
 * @title TengXun001Test
 * @project MyBookCodes
 * @desc TODO
 */
public class TengXun001Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        long m = in.nextLong();
        long number = n / (2 * m);

        long result = number * m * m;

        System.out.println(result);

    }
}
