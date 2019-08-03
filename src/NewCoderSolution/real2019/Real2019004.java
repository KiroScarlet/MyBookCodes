package NewCoderSolution.real2019;

import org.junit.Test;

import java.util.Scanner;

/**
 * @author KiroScarlet
 * @date 2019-08-03  -10:45
 * @title Real2019004
 * @project MyBookCodes
 * @desc 迷路的牛牛
 */
public class Real2019004 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        if (number <= 0) {
            System.out.println("N");;
            return;
        }
        String turnString = in.next();
        char[] turnChar = turnString.toCharArray();
        int leftNum = 0, rightNum = 0;
        for (int i = 0; i < number; i++) {
            if (turnChar[i] == 'L') {
                leftNum++;
            }
            if (turnChar[i] == 'R') {
                rightNum++;
            }
        }
        //大于0表示最后是向左转，小于0表示最后是向右转
        int lastLeftNum = (leftNum - rightNum ) % 4;

        char[] director = new char[]{'N', 'W', 'S', 'E'};
        //全部转换为向左转
        System.out.println(director[(lastLeftNum + 4) % 4]);

//        switch (lastLeftNum) {
//            case 0:
//                System.out.println("N");break;
//            case 1:
//                System.out.println("W");break;
//            case 2:
//                System.out.println("S");break;
//            case 3:
//                System.out.println("E");break;
//            case -3:
//                System.out.println("W");break;
//            case -2:
//                System.out.println("S");break;
//            case -1:
//                System.out.println("E");break;
//        }
    }

    @Test
    public void test() {
        System.out.println(-23%4);
    }
}
