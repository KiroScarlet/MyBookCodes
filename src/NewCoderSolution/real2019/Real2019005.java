package NewCoderSolution.real2019;

import java.util.Scanner;

/**
 * @author KiroScarlet
 * @date 2019-08-03  -11:21
 * @title Real2019005
 * @project MyBookCodes
 * @desc TODO
 */
public class Real2019005 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), k = in.nextInt();

        long count = 0;
        //按列统计，对于每一个y，当y>k时，这一列才会出现余数为k的情况，且是以1,2,...,y-1,0的循环形式出现的
        for (int y = k + 1; y <= n; y++) {
            count += (n / y) * (y - k);
            if ((n % y) >= k) {
                //k是否为0
                if (k != 0) {
                    count += ((n % y) - k + 1);
                } else {
                    count += n % y;
                }
            }
//            System.out.println(y+":"+count);
        }
        System.out.println(count);
    }
}
