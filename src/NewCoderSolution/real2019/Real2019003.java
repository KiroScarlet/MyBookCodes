package NewCoderSolution.real2019;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author KiroScarlet
 * @date 2019-08-02  -17:08
 * @title Real2019003
 * @project MyBookCodes
 * @desc TODO
 */
public class Real2019003 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testNumber = in.nextInt();

        ArrayList<String> roads = new ArrayList<>(testNumber);

        for (int i = 0; i < testNumber; i++) {
            int length = in.nextInt();
            roads.add(in.next());
        }

        for (String road : roads) {
            char[] roadChars = road.toCharArray();
            int flag = 0;
            int count = 0;

            while (flag < roadChars.length) {
                //如果当前为“.”，那么放一个路灯能照亮三格，右移三位，否则右移一位
                if (roadChars[flag] == '.') {
                    count++;
                    flag += 3;
                } else {
                    flag += 1;
                }
            }
            System.out.println(count);
        }
    }
}
