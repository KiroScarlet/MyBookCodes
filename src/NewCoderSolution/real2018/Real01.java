package NewCoderSolution.real2018;


import java.util.Scanner;

/**
 * @author KiroScarlet
 * @date 2019-04-08  -11:49
 * 题目描述
给定一个无序数组，包含正数、负数和0，要求从中找出3个数的乘积，使得乘积最大，要求时间复杂度：O(n)，空间复杂度：O(1)
输入描述:
无序整数数组A[n]
输出描述:
满足条件的最大乘积
 */
public class Real01 {
    //AC的o(n)代码，一定要注意存储的数组类型是long型（之前是int型就没通过）
    //在遍历数组是需要记录第一，第二，第三大，和最小，次小的数（负负的正）
    // 返回Math.max(max1*max2*max3,max1*min1*min2)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] array = new long[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextLong();
        }

        long result=getLargestMul(array, n);

        System.out.println(result);
    }

    private static long getLargestMul(long[] num, int len) {
        long max1=0,max2=0,max3=0,min1=0,min2=0;
        for (int i = 0; i < len; i++) {
            if (num[i] != 0) {
                if (num[i] > max1) {
                    max3 = max2;
                    max2 = max1;
                    max1 = num[i];
                } else if (num[i] > max2) {
                    max3 = max2;
                    max2 = num[i];
                } else if (num[i] > max3) {
                    max3 = num[i];
                }
                if (num[i] < min1) {
                    min2 = min1;
                    min1 = num[i];
                } else if (num[i] < min2) {
                    min2 = num[i];
                }

            }
        }
        return Math.max(max1*max2*max3,max1*min1*min2);
    }
}
