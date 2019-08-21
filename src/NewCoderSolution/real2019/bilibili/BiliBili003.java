package NewCoderSolution.real2019.bilibili;

import java.util.Scanner;

/**
 * @author KiroScarlet
 * @date 2019-08-20  -19:34
 * @title BiliBili003
 * @project MyBookCodes
 * @desc TODO
 */
public class BiliBili003 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int M = in.nextInt();
        int[] weight = new int[N];
        int[] value = new int[N];
        for (int i = 0; i < N; i++) {
            weight[i] = in.nextInt();
        }
        for (int i = 0; i < N; i++) {
            value[i] = in.nextInt();
        }

        
        //简单的背包问题
        int[] w = new int[N + 1];
        int[] v = new int[N + 1];
        for (int i = 1; i < N + 1; i++) {
            w[i] = weight[i - 1];
            v[i] = value[i - 1];
        }

        int[] values = new int[M + 1];
        for (int i = 1; i < N + 1; i++) {
            for (int j = M; j >= w[i]; j--) {
                if (values[j] < values[j - w[i]] + v[i]) {
                    values[j] = values[j - w[i]] + v[i];
                }
            }
        }

        System.out.println(values[M]);
    }

    
}
