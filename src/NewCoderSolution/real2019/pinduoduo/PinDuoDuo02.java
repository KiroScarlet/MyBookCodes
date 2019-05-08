package NewCoderSolution.real2019.pinduoduo;

import java.util.Scanner;

/**
 * @author KiroScarlet
 * @date 2019-05-06  -19:29
 */
public class PinDuoDuo02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] array = new int[k];
        for (int i = 0; i < array.length; i++) {
            array[i] = in.nextInt();
        }

        int result = n;
        for (int i = 0; i < array.length; i++) {
            result -= (n - array[i]);
        }

        if (result < 0) {
            result = 0;
        }

        System.out.println(result);
    }
}
