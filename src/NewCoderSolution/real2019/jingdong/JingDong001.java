package NewCoderSolution.real2019.jingdong;

import java.util.Scanner;

/**
 * @author KiroScarlet
 * @date 2019-08-24  -19:52
 * @title JingDong001
 * @project MyBookCodes
 * @desc TODO
 */
public class JingDong001 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] heights = new int[n];
        for (int i = 0; i < n; i++) {
            heights[i] = in.nextInt();
        }

        int i = 0, j = 0, count = 0;
        while (i < n) {
            count++;
            int min = Integer.MAX_VALUE;
            int max = 0;
            int minIndex = i;
            for (int k = i; k < n; k++) {
                if (heights[k] < min) {
                    min = heights[k];
                    minIndex = k;
                }
            }
            //找最大值
            for (int k = i; k < minIndex; k++) {
                if (heights[k] > max) {
                    max = heights[k];
                }
            }
            //找到右边最后一个小于该最大值的位置
            minIndex ++;
            if (minIndex < n) {
                for (int k = minIndex + 1; k < n; k++) {
                    if (heights[k] < max) {
                        minIndex = k;
                    }
                }

                i = minIndex;
            } else {
                break;
            }


        }
        System.out.println(count);
    }



}
