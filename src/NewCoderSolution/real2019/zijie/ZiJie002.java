package NewCoderSolution.real2019.zijie;

import java.util.Scanner;

/**
 * @author KiroScarlet
 * @date 2019-08-25  -20:40
 * @title ZiJie002
 * @project MyBookCodes
 * @desc TODO
 */
public class ZiJie002 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int reslut = 0;
        reslut = getCount(n);
        System.out.println(reslut);
    }

    private static int getCount(int n) {
        return (int) n*(n-1)/2;

    }
}
