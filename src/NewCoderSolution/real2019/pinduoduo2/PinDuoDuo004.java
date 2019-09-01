package NewCoderSolution.real2019.pinduoduo2;

import java.util.Scanner;

/**
 * @author KiroScarlet
 * @date 2019-09-01  -16:32
 * @title PinDuoDuo004
 * @project MyBookCodes
 * @desc TODO
 */
public class PinDuoDuo004 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        System.out.println(getNum(m,n,k));
    }

   private static int getNum(int m, int n, int k) {

        int low = 1, high = m * n + 1;
        k = m * n + 1 - k;
        int mid, count;
        while (low < high) {
            mid = low + (high - low) / 2;
            count = 0;
            for (int i = 1; i <= m; i++) {
                count += (mid/i > n ? n : mid/i);
            }
            if (count >= k) high = mid;
            else low = mid + 1;
        }
        return low;
    }
}
