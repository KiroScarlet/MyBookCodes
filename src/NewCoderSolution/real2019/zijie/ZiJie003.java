package NewCoderSolution.real2019.zijie;

import java.util.Scanner;

/**
 * @author KiroScarlet
 * @date 2019-08-25  -19:37
 * @title ZiJie003
 * @project MyBookCodes
 * @desc TODO
 */
public class ZiJie003 {
    private int[] getMerge(int[] arr) {
        for (int i = 0; i < 3; i++) {
            if (arr[i] == arr[i + 1]) {
                arr[i] = arr[i] * 2;
                arr[i + 1] = 0;
            }
        }
        for (int i = 0; i < 3; i++) {
            if (arr[i] == 0) {
                for (int j = i + 1; j < 4; j++) {
                    if (arr[j] != 0) {
                        int tmp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = tmp;
                    }
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int v = in.nextInt();
        int[][] m = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                m[i][j] = in.nextInt();
            }
        }

        //拆分数组
        int[] arr1 = new int[4];
        int[] arr2 = new int[4];
        int[] arr3 = new int[4];
        int[] arr4 = new int[4];
        if (v == 1) {
            arr1 = new int[4];
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {

                }
            }
        }
    }
}
