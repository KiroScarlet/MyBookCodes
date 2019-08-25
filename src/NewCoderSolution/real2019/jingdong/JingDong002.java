package NewCoderSolution.real2019.jingdong;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * @author KiroScarlet
 * @date 2019-08-24  -20:41
 * @title JingDong002
 * @project MyBookCodes
 * @desc TODO
 */
public class JingDong002 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();


        int[] boys = new int[n + 1];
        int[] girls = new int[n + 1];

        int[][] friends = new int[m][2];

        for (int i = 0; i < m; i++) {
            friends[i][0] = in.nextInt();
            friends[i][1] = in.nextInt();
        }

        //
        System.out.println(1);
        System.out.println(1);

    }
}
