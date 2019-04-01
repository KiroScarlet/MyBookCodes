package DataStructure.Chapter1;

import org.junit.Test;

/**
 * @author KiroScarlet
 * @date 2019-03-14  -22:57
 */
public class MaxSubSum {

    //分治法求最大子序列O(nlg(n))
    private static int maxSumRec(int[] a, int left, int right) {
        if (left == right) {//只有一个元素
            if (a[left] > 0) {
                return a[left];
            }else
                return 0;
        }

        int center = (left + right) / 2;
        int maxLeftSum = maxSumRec(a, left, center);
        int maxRightSum = maxSumRec(a, center+1, right);

        int maxLeftBorderSum = 0, leftBorderSum = 0;
        for (int i = center; i >= left; i--) {
            leftBorderSum += a[i];
            if (leftBorderSum > maxLeftBorderSum) {
                maxLeftBorderSum = leftBorderSum;
            }
        }

        int maxRightBorderSum = 0, rightBorderSum = 0;
        for (int i = center+1; i <= right; i++) {
            rightBorderSum += a[i];
            if (rightBorderSum > maxRightBorderSum) {
                maxRightBorderSum = rightBorderSum;
            }
        }

        return Math.max(Math.max(maxLeftSum, maxRightSum), maxLeftBorderSum + maxRightBorderSum);
    }

    //最大子序列O(n)的算法
    public static int maxSubSumOn(int[] a) {
        int maxSum = 0, thisSum = 0;
        for (int i = 0; i < a.length; i++) {
            thisSum += a[i];
            if (thisSum > maxSum) {//当前子序列为最大
                maxSum = thisSum;
            } else if (thisSum < 0) {
                thisSum = 0;//当前子序列从i+1开始重新计算
            }
        }
        return maxSum;
    }

    @Test
    public void test() {
        int[] a = {4, -3, 5, -2, -1, 2, 6, -2};
        int result = maxSumRec(a, 0, a.length - 1);
        System.out.println(result);
        int result2 = maxSubSumOn(a);
        System.out.println(result2);
    }

}
