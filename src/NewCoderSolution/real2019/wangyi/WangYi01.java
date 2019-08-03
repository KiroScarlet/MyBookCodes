package NewCoderSolution.real2019.wangyi;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author KiroScarlet
 * @date 2019-08-03  -14:55
 * @title WangYi01
 * @project MyBookCodes
 * @desc TODO
 */
public class WangYi01 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = in.nextInt();
        }

        int q = in.nextInt();
        for (int i = 0; i < q; i++) {
            int target = in.nextInt();
            double num = is(array, array[target - 1]);
            System.out.printf("%.6f\n", (num - 1) / n * 100);
        }
    }

    private static double is(int[] array, int target) {
        double num = 0;
        for (int i = 0; i < array.length; i++) {
            if (target >= array[i]) {
                num++;
            }
        }
        return num;
    }
}