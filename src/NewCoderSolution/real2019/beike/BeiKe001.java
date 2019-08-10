package NewCoderSolution.real2019.beike;

import java.util.Scanner;

/**
 * @author KiroScarlet
 * @date 2019-08-10  -19:02
 * @title BeiKe001
 * @project MyBookCodes
 * @desc TODO
 */
public class BeiKe001 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long[] array = new long[n];

        for (int i = 0; i < n; i++) {
            array[i] = in.nextLong();
        }

        long minDiff = Long.MAX_VALUE;
        int flag = 0;
        for (int i = 0; i < n - 1; i++) {
            long tmp = array[i] - array[i + 1];
            if (tmp < 0) {
                tmp = tmp * -1;
            }
            if (tmp < minDiff) {
                minDiff = tmp;
                flag = i;
            }
        }
        System.out.print(array[flag] + " " + array[flag + 1]);
    }
}
