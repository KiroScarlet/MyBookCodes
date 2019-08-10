package NewCoderSolution.real2019.beike;

import java.util.Scanner;

/**
 * @author KiroScarlet
 * @date 2019-08-10  -15:55
 * @title BeiKeTest
 * @project MyBookCodes
 * @desc TODO
 */
public class BeiKeTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int m = in.nextInt();
            int n = in.nextInt();
            int count = 0;
            for (int i = m; i <= n; i++) {
                double tmp = 0;
                int number = i;
                do {
                    tmp += Math.pow(number % 10, 3);
                    number = number / 10;
                } while (number  > 0);
                if ((double) i == tmp) {
                    System.out.print(i + " ");
                    count++;
                }
            }
            if (count == 0) {
                System.out.println("no");
            } else {
                System.out.println();
            }
        }
    }
}
