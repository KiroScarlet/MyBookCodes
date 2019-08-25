package NewCoderSolution.real2019.wanmei;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * @author KiroScarlet
 * @date 2019-08-23  -18:57
 * @title WanMei001
 * @project MyBookCodes
 * @desc TODO
 */
public class WanMei001 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();

        String[] split = s.split(" ");
        int n = split.length;
        Integer[] weight = new Integer[n];
        for (int i = 0; i < n; i++) {
            weight[i] = Integer.valueOf(split[i]);

        }

        int limit = in.nextInt();

        Arrays.sort(weight, Collections.reverseOrder());


        int bootNum = 0;
        for (int i = 0; i < n - 1; i++) {
            if (weight[i] != -1) {
                for (int j = i + 1; j < n; j++) {
                    if (weight[j] != -1) {
                        if ((weight[i] + weight[j]) <= limit) {
                            bootNum++;
                            weight[i] = -1;
                            weight[j] = -1;
                        }
                    }
                }
            }
        }
        for (int i = 0; i < n; i++) {
            if (weight[i] != -1) {
                bootNum++;
            }
        }
        System.out.println(bootNum);
    }
}
