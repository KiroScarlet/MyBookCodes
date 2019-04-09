package NewCoderSolution.real2019.zhaohang;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author KiroScarlet
 * @date 2019-04-09  -19:54
 */
public class ZhaoHang02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int w = in.nextInt();
        int[] glass = new int[2 * n];
        for (int i = 0; i < 2 * n; i++) {
            glass[i] = in.nextInt();
        }
        Arrays.sort(glass);
        if (glass[0] * 2 <= glass[n - 1]) {
            if (glass[0] * 3 * n < w) {
                System.out.println(((double) (glass[0] * 3 * n)));
            } else {
                System.out.println((double) w);
            }
        } else {
            if ((double)(glass[n - 1] * 3 * n/2) < w) {
                System.out.println(glass[n - 1] * 3 * n/2);
            } else {
                System.out.println((double) w);
            }
        }
    }
}
