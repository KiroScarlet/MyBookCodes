package NewCoderSolution.real2018;

import java.io.BufferedReader;
import java.util.Scanner;

/**
 * @author KiroScarlet
 * @date 2019-04-08  -15:41
 */
/*题目描述
        假设一个探险家被困在了地底的迷宫之中，要从当前位置开始找到一条通往迷宫出口的路径。迷宫可以用一个二维矩阵组成，
        有的部分是墙，有的部分是路。迷宫之中有的路上还有门，每扇门都在迷宫的某个地方有与之匹配的钥匙，只有先拿到钥匙才能打开门。
        请设计一个算法，帮助探险家找到脱困的最短路径。如前所述，迷宫是通过一个二维矩阵表示的，
        每个元素的值的含义如下 0-墙，1-路，2-探险家的起始位置，3-迷宫的出口，大写字母-门，小写字母-对应大写字母所代表的门的钥匙
        输入描述:
        迷宫的地图，用二维矩阵表示。第一行是表示矩阵的行数和列数M和N
        后面的M行是矩阵的数据，每一行对应与矩阵的一行（中间没有空格）。M和N都不超过100, 门不超过10扇。
        输出描述:
        路径的长度，是一个整数

        示例1
        输入
        5 5
        02111
        01a0A
        01003
        01001
        01111
        输出
        7
        */
public class Real04 {

    public static void main(String[] args) {

        int[] a = {12,34343, 4, 555};

        Real04 real04 = new Real04();
        real04.sort(a,a.length);
        System.out.println();
    }
    public void sort(int[] array, int len) {
        // 完成这个函数

    }
}