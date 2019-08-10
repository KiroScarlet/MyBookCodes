package NewCoderSolution.real2019.beike;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author KiroScarlet
 * @date 2019-08-10  -19:43
 * @title BeiKe003
 * @project MyBookCodes
 * @desc TODO
 */
public class BeiKe003 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        Arrays.sort(arr);

        int count = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if ((double) arr[i] >= (arr[j] * 0.9)) {

                    count++;
                } else {
                    break;
                }
            }
        }

        System.out.println(count);
    }
}
