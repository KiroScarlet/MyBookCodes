package NewCoderSolution.real2019.pinduoduo2;

import java.util.Scanner;

/**
 * @author KiroScarlet
 * @date 2019-09-01  -15:01
 * @title PinDuoDuo001
 * @project MyBookCodes
 * @desc TODO
 */
public class PinDuoDuo001 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String[] split = s.split(";");
        String numberString = split[0];
        int n = Integer.valueOf(split[1]);
        String[] numbers = numberString.split(",");
        long[] arr = new long[numbers.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Long.valueOf(numbers[i]);
        }

        quickSort(arr, 0, arr.length - 1);

        for (int i = 0; i < n-1; i++) {
            System.out.print(arr[i] + ",");
        }
        System.out.print(arr[n - 1]);


    }

    public static void quickSort(long[] values, int low, int high) {
        if (low >= high) {
            return;
        }
        int i=low,j=high;
        long temp = values[low];
        while (i < j) {
            while (compare(values[j], temp) >= 0 && i < j) {
                j--;
            }
            while (compare(values[i], temp) <= 0 && i < j) {
                i++;
            }
            if (i < j) {
                long t = values[i];
                values[i] = values[j];
                values[j] = t;
            }
        }

        values[low] = values[i];
        values[i] = temp;

        quickSort(values, low, i - 1);
        quickSort(values, i + 1, high);

    }

    private static int compare(long b, long a) {
        if (a % 2 == 0 && b % 2 != 0) {
            return 1;
        } else if (a % 2 != 0 && b % 2 == 0) {
            return -1;
        } else {
            return Long.compare(a, b);
        }
    }
}
