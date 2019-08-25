package NewCoderSolution.real2019.zijie;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author KiroScarlet
 * @date 2019-08-25  -19:09
 * @title ZiJie001
 * @project MyBookCodes
 * @desc TODO
 */
public class ZiJie001 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] groupNums = new int[n];


        int count = 0;

        int groupNum = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int linkNum = in.nextInt();
                if (linkNum >= 3) {
                    if (groupNums[i] == 0 && groupNums[j] == 0) {
                        groupNums[i] = groupNum;
                        groupNums[j] = groupNum;
                        groupNum++;
                        count++;
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
                            count--;
                        }
                    }
                }
            }
        }
        for (int i = 0; i < n; i++) {
            if (groupNums[i] == 0) {
                count++;
            }
        }

        System.out.println(count);
    }
}
