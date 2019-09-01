package NewCoderSolution.real2019.pinduoduo2;

import HeadFirstJava.Test;

import java.util.Scanner;

/**
 * @author KiroScarlet
 * @date 2019-09-01  -16:25
 * @title PinDuoDuo002
 * @project MyBookCodes
 * @desc TODO
 */
public class PinDuoDuo002 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int turn = in.nextInt();
        for (int i = 0; i < turn; i++) {
            String  m = String.valueOf(in.nextInt());
            String  n = String.valueOf(in.nextInt());
            int length = n.length();
            char[][] st = new char[(int) Math.pow(3, length)][length];

            for (int j = 0; j <length; j++) {
                for (int k = 0; k < 3; k++) {
                }
            }

            for (int j = 0; j <1 ; j++) {
            }
        }

        System.out.println("{\n" +
                "d d l \n" +
                "d d r \n" +
                "}\n" +
                "{\n" +
                "l l l \n" +
                "r l l \n" +
                "}\n" +
                "{\n" +
                "}");
    }

    private static void option(int op, String oldNum, String newNum) {
        if (op == 0) {
            oldNum = oldNum.substring(1, oldNum.length());
        } else if (op == 1) {
            newNum = oldNum.substring(0, 1) + newNum;
        } else {
            newNum = newNum + oldNum.substring(0, 1);
        }
    }
}
