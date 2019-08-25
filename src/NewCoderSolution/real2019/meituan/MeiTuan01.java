package NewCoderSolution.real2019.meituan;

import java.util.Scanner;

/**
 * @author KiroScarlet
 * @date 2019-08-22  -16:21
 * @title MeiTuan001
 * @project MyBookCodes
 * @desc TODO
 */
public class MeiTuan01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String[] values = s.split(",");

        //排序
        quickSort(values, 0, values.length - 1);
        for (int i = 0; i < values.length - 1; i++) {
            System.out.print(values[i]+",");
        }
        System.out.println(values[values.length - 1]);

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

    public static int compare(String b, String a) {
        if (a.equals("")) {
            if (b.equals("")) {
                return 0;
            } else {
                return 1;
            }
        }
        if (b.equals("")) {
            return -1;
        }
        for (int i = 0; i < a.length() && i < b.length(); i++) {
            if (a.charAt(i) > b.charAt(i)) {
                return 1;
            } else if (a.charAt(i) < b.charAt(i)) {
                return -1;
            }
        }
        //说明前面的都相等
        if (a.length() < b.length()) {
            return 1;
        } else if (a.length() > b.length()) {
            return -1;
        }
        return 0;
    }

}
