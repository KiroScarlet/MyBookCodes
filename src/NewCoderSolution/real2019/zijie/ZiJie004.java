package NewCoderSolution.real2019.zijie;

import com.sun.org.apache.bcel.internal.generic.GETFIELD;

import java.util.Scanner;

/**
 * @author KiroScarlet
 * @date 2019-08-25  -20:15
 * @title ZiJie004
 * @project MyBookCodes
 * @desc TODO
 */
public class ZiJie004 {

    private static int getGCD(int a, int b) {
        int result = 0;
        while (b != 0) {
            result = a % b;
            a = b;
            b = result;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        if (n <= 0) {
            System.out.println(0);
            return;
        }
        if (n == 1) {
            System.out.println(1);
            return;
        }

        int[][] m = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    m[i][j] = 1;
                }
                if ((getGCD(arr[i], arr[j]) > 1)) {
                    m[i][j] = 1;
                }
            }
        }

        int[] groupNums = new int[n];

        int groupNum = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (m[i][j] == 1) {
                    if (groupNums[i] == 0 && groupNums[j] == 0) {
                        groupNums[i] = groupNum;
                        groupNums[j] = groupNum;
                        groupNum++;
                    } else if (groupNums[i] == 0) {
                        groupNums[i] = groupNums[j];
                    } else if (groupNums[j] == 0) {
                        groupNums[j] = groupNums[i];
                    } else {
                        int group1 = groupNums[i];
                        int group2 = groupNums[j];
                        if (group1 != group2) {
                            for (int k = 0; k < n; k++) {
                                if (groupNums[k] == group2) {
                                    groupNums[k] = group1;
                                }
                            }
                        }
                    }
                }
            }
        }

        int[] nums = new int[groupNum];
        int count = 0;
        for (int i = 0; i < n; i++) {
            nums[groupNums[i]]++;
        }
        for (int i = 0; i < nums.length; i++) {
            if (count < nums[i]) {
                count = nums[i];
            }
        }

        System.out.println(count);


    }
}
