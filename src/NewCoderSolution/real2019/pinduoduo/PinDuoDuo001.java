package NewCoderSolution.real2019.pinduoduo;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author KiroScarlet
 * @date 2019-08-11  -15:04
 * @title PinDuoDuo001
 * @project MyBookCodes
 * @desc TODO
 */
public class PinDuoDuo001 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
        double result = Double.MAX_VALUE;
        for (int i = 0; i < n - 3; i++) {
            double average = 0;
            double variance = 0;
            average = (arr[i] + arr[i + 1] + arr[i + 2]) / 3.0;
            variance = ((arr[i] - average) * (arr[i] - average)
                    + (arr[i + 1] - average) * (arr[i + 1] - average)
                    + (arr[i + 2] - average) * (arr[i + 2] - average)) / 3;
            if (variance < result) {
                result = variance;
            }
        }

        System.out.printf("%.2f", result);
    }
}
