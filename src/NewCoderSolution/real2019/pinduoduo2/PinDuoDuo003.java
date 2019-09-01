package NewCoderSolution.real2019.pinduoduo2;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author KiroScarlet
 * @date 2019-09-01  -15:29
 * @title PinDuoDuo003
 * @project MyBookCodes
 * @desc TODO
 */
public class PinDuoDuo003 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        float[] arr = new float[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        float max = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }


        //算i的概率
        float[] pro = new float[(int) max + 1];

        pro[1]=1;
        for (int i = 0; i < arr.length; i++) {
            pro[1] *= (1 / arr[i]);
        }
        for (int i = 2; i <= max; i++) {
            pro[i] = 1;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] > i) {
                    pro[i] *= (i / arr[j]);
                }
            }
            for (int j = 1; j < i; j++) {
                pro[i] -= pro[j];
            }
        }

        float result = 0;
        for (int i = 1; i <= max; i++) {
            result += i * pro[i];
        }

//        System.out.println(Arrays.toString(pro));

        System.out.printf("%.2f", result);

    }

    private float getI(int[] arr, int number, float[] pro) {
        float result = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= number) {
                result *= (1 / arr[i]);
            }
        }
        return result;
    }
}
