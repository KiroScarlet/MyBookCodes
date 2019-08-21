package NewCoderSolution.real2019.bilibili;

import java.util.Scanner;

/**
 * @author KiroScarlet
 * @date 2019-08-20  -19:27
 * @title BiliBili001
 * @project MyBookCodes
 * @desc TODO
 */
public class BiliBili001 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();

        String[] split = s.split(" ");
        int length = split.length;
        for (int i = 0; i < length / 2; i++) {
            String tmp = null;
            tmp = split[i];
            split[i] = split[length - i - 1];
            split[length - i - 1] = tmp;
        }

        for (String s1 : split) {
            System.out.print(s1+" ");
        }
    }
}
