package NewCoderSolution.real2019.beike;

import java.util.Scanner;

/**
 * @author KiroScarlet
 * @date 2019-08-10  -19:54
 * @title BeiKe004
 * @project MyBookCodes
 * @desc TODO
 */
public class BeiKe004 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        //从前往后去掉已经满足要求的
        int left = 0, right = n - 1;
        for (int i = left; i < n - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                left++;
            } else {
                break;
            }
        }
        for (int i = right; i > 0; i--) {
            if (arr[i] < arr[i - 1]) {
                right--;
            } else {
                break;
            }
        }

//        System.out.println(left + " " + right);

        int result = Integer.MAX_VALUE;
        if (left < right) {
            for (int i = left; i <= right; i++) {

                int tmpResult = 0;
                //假设把arr[i]作为当前数组的最大值
                //从前往后的最大值，从后往前的最大值看哪个大，就把这个值设为当前的值
                int max = Math.max(i - left + arr[left], right - i + arr[right]);
                tmpResult += max - arr[i];
                //从前往后
                for (int j = left + 1; j < i; j++) {
                    tmpResult += (i - j) + arr[left] - arr[j];
                }
                //从后往前
                for (int j = right-1; j > i; j--) {
                    tmpResult += right-j + arr[right] - arr[j];
                }

                if (tmpResult < result) {
                    result = tmpResult;
                }
            }
    }
        System.out.println(result);

    }
}
