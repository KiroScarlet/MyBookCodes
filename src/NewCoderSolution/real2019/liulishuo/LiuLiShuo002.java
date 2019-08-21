package NewCoderSolution.real2019.liulishuo;

import java.util.Scanner;

/**
 * @author KiroScarlet
 * @date 2019-08-19  -19:18
 * @title LiuLiShuo002
 * @project MyBookCodes
 * @desc TODO
 */
public class LiuLiShuo002 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int n = in.nextInt();
            System.out.println(getCount(n));
        }


    }

    private static long getCount(int n) {
        if (n == 1 || n == 2) {
            return n;
        }

        long n1 = 1;
        long n2 = 2;

        for (int i = 3; i <= n; i++) {
            long tmp = n2;
            n2 = n1 + n2;
            n1 = tmp;
        }
        return n2;
    }
}
