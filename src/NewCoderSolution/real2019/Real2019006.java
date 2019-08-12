package NewCoderSolution.real2019;
import java.util.Scanner;

/**
 * @author KiroScarlet
 * @date 2019-08-03  -14:54
 * @title Real2019006
 * @project MyBookCodes
 * @desc TODO
 */
public class Real2019006 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();


        int x1Min = 0, y1Min = 0, x2Max = 0, y2Max = 0;

        int[][] coordinates = new int[4][n];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < n; j++) {
                coordinates[i][j] = in.nextInt();
            }
        }

        //找出最左下角和最右上角的坐标
        for (int k = 0; k < n; k++) {
            if (coordinates[0][k] < x1Min) {
                x1Min = coordinates[0][k];
            }
            if (coordinates[1][k] < y1Min) {
                y1Min = coordinates[1][k];
            }
            if (coordinates[2][k] > x2Max) {
                x2Max = coordinates[2][k];
            }
            if (coordinates[3][k] > y2Max) {
                y2Max = coordinates[3][k];
            }
        }


        int maxCount = 0;
        for (int i : coordinates[0]) {
            for (int j : coordinates[1]) {
                int count = 0;
                //遍历所有的矩形
                for (int k = 0; k < n; k++) {
                    //如果该小方块包含在该矩形中，计数+1
                    if (i >= coordinates[0][k] && j >= coordinates[1][k]
                            && (i + 1) <= coordinates[2][k] && (j + 1) <= coordinates[3][k]) {
                        count++;
                    }
                }
                if (maxCount < count) {
                    maxCount = count;
                }
            }
        }

//        for (int i = x1Min; i < x2Max; i++) {
//            for (int j = y1Min; j < y2Max; j++) {
//                int count = 0;
//                //遍历所有的矩形
//                for (int k = 0; k < n; k++) {
//                    //如果该小方块包含在该矩形中，计数+1
//                    if (i >= coordinates[0][k] && j >= coordinates[1][k]
//                            && (i + 1) <= coordinates[2][k] && (j + 1) <= coordinates[3][k]) {
//                        count++;
//                    }
//                }
//                if (maxCount < count) {
//                    maxCount = count;
//                }
//            }
//        }


        System.out.println(maxCount);


    }


}

