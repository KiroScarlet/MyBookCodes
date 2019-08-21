package NewCoderSolution.real2019.tengxun;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author KiroScarlet
 * @date 2019-08-17  -21:18
 * @title TengXun002
 * @project MyBookCodes
 * @desc TODO
 */
public class TengXun002 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        double number = Math.pow(2, n);
        int[] arr = new int[(int) number];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

        int m = in.nextInt();
        int[] result = new int[m];
        for (int i = 0; i < m; i++) {
            result[i] = in.nextInt();
        }
        //翻转
        for (int i = 0; i < m; i++) {
            int length = (int) Math.pow(2, result[i]);
            for (int j = 0; j < arr.length; j += length) {
                for (int k = 0; k < length / 2; k++) {
                    int tmp = arr[k + j];
                    arr[k + j] = arr[length - k - 1 + j];
                    arr[length - k - 1 + j] = tmp;
                }
            }
//            System.out.println(Arrays.toString(arr));
            int[] arrTest = new int[arr.length];
            System.arraycopy(arr, 0, arrTest, 0, arr.length);
            System.out.println(mergeSort(arrTest));
//            System.out.println(Arrays.toString(arr));
        }

    }

    private static int mergeSort(int a[]) {
        int count = 0;
        int n = a.length;
        if (n <= 1) {
            return 0;
        }
        int b[] = new int[n / 2];
        System.arraycopy(a, 0, b, 0, n / 2);
        int c[];
        if (n % 2 == 0) {
            c = new int[n / 2];
            System.arraycopy(a, n / 2, c, 0, n / 2);
        } else {
            c = new int[n / 2 + 1];
            System.arraycopy(a, n / 2, c, 0, n / 2 + 1);
        }

        count += mergeSort(b);
        count += mergeSort(c);
        count += merge(b, c, a);
        return count;
    }

    private static int merge(int b[], int c[], int a[]) {
        int count = 0;      //标志
        int i = 0, j = 0, k = 0;
        int p = b.length, q = c.length;
        while (i < p && j < q) {
            if (b[i] <= c[j]) {
                a[k] = b[i];
                i++;
            } else {
                a[k] = c[j];
                j++;
                count += p - i;     //记录逆序对个数
            }
            k++;
        }
        if (i == p) {
            for (; j < q; j++, k++) {
                a[k] = c[j];
            }
        } else if (j == q) {
            for (; i < p; i++, k++) {
                a[k] = b[i];
            }
        }
        return count;
    }
}
