package NewCoderSolution.real2019.bilibili;

import CoreJava.CoreJava1.Chapter6.LengthComparator;
import NewCoderSolution.resources.QuickSort;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author KiroScarlet
 * @date 2019-08-20  -19:23
 * @title BiliBili002
 * @project MyBookCodes
 * @desc TODO
 */
public class BiliBili002 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String[] values = s.split(",");

        //排序
        quickSort(values, 0, values.length - 1);
        for (String value : values) {
            System.out.print(value);
        }

    }


    public static void quickSort(String[] values, int low, int high) {
        if (low >= high) {
            return;
        }
        int i=low,j=high;
        String temp = values[low];
        while (i < j) {
            while (compare(values[j], temp) >= 0 && i < j) {
                j--;
            }
            while (compare(values[i], temp) <= 0 && i < j) {
                i++;
            }
            if (i < j) {
                String t = values[i];
                values[i] = values[j];
                values[j] = t;
            }
        }

        values[low] = values[i];
        values[i] = temp;

        quickSort(values, low, i - 1);
        quickSort(values, i + 1, high);

    }

    public static int compare(String a, String b) {
        String tmp1 = a + b;
        String tmp2 = b + a;
        for (int i = 0; i < tmp1.length() - 1; i++) {
            if (tmp1.charAt(i) > tmp2.charAt(i)) {
                return 1;
            } else if (tmp1.charAt(i) < tmp2.charAt(i)) {
                return -1;
            }
        }
        return 0;
    }
}

