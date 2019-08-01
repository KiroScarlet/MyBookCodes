package NewCoderSolution.real2019.huawei;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * @author KiroScarlet
 * @date 2019-07-31  -19:05
 * @title HuaWei190731
 * @project MyBookCodes
 * @desc 华为笔试第一题
 */
public class HuaWei190731 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BigDecimal D = in.nextBigDecimal();
//        System.out.println(D);
        int flag = 0;
        BigDecimal sales = new BigDecimal(0);
        //初始值
        BigDecimal init = new BigDecimal(100);


        for (int i = 10000; i >0; i--) {
            BigDecimal tmp = D.multiply(BigDecimal.valueOf(i));
            BigDecimal bigDecimal = tmp.setScale(0,BigDecimal.ROUND_HALF_UP);
//            System.out.println(bigDecimal);
            BigDecimal chazhi = bigDecimal.subtract(tmp);
            if (chazhi.compareTo(new BigDecimal(0)) < 1) {
                chazhi = chazhi.multiply(new BigDecimal(-1));
            }
//            System.out.println(chazhi.toPlainString());
            if (chazhi.compareTo(init) < 1) {
                init = new BigDecimal(chazhi.toPlainString());
                flag = i;
                sales = new BigDecimal(bigDecimal.toPlainString());

            }
        }
        System.out.println(sales+" "+flag);

    }
}
