package NewCoderSolution.real2019.wanmei;

import java.util.Scanner;

/**
 * @author KiroScarlet
 * @date 2019-08-23  -19:30
 * @title WanMei002
 * @project MyBookCodes
 * @desc TODO
 */
public class WanMei002 {

    private static int Max = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 6;
        int[][] mMartix = new int[n][n];


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mMartix[i][j] = in.nextInt();
            }
        }


    }


}
