package NewCoderSolution.real2019.tengxun;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author KiroScarlet
 * @date 2019-08-17  -20:29
 * @title TengXun004
 * @project MyBookCodes
 * @desc TODO
 */
public class TengXun004 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            int count = 0;
            //往左看
            int leftMax = 0, rightMax = 0;
            if (i > 0) {
                for (int j = i - 1; j >= 0; j--) {
                    if (arr[j] > leftMax) {
                        count++;
                        leftMax = arr[j];
                    }
                }
            }
            if (i < n - 1) {
                for (int j = i + 1; j < n; j++) {
                    if (arr[j] > rightMax) {
                        count++;
                        rightMax = arr[j];
                    }
                }
            }
            result[i] = count+1;
        }
        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}
