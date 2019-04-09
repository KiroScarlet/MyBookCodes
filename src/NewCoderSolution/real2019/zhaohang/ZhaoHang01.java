package NewCoderSolution.real2019.zhaohang;

import java.util.Scanner;

/**
 * @author KiroScarlet
 * @date 2019-04-09  -19:27
 */
public class ZhaoHang01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long result = getResult(n);
        System.out.println(result%666666666);

    }

    public static long getResult(int n) {
        if (n < 6) {
            return 0;
        }else if (n == 6) {
            return 1;
        }else{
            return (long) Math.pow(2,(n-6));
        }

    }
}

