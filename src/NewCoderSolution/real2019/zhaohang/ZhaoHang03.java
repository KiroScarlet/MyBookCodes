package NewCoderSolution.real2019.zhaohang;

import java.util.Scanner;

/**
 * @author KiroScarlet
 * @date 2019-04-09  -20:14
 */
public class ZhaoHang03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] glass = new int[n];
        for (int i = 0; i < n; i++) {
            glass[i] = in.nextInt();
        }

        int count = 0;
        for (int i = 0; i < n; i++) {
            while (glass[i] != 1) {
                glass[i] = glass[i] / 2;
                count++;
            }
        }

        System.out.println(count);
    }
}
