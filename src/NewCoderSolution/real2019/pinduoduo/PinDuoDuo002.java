package NewCoderSolution.real2019.pinduoduo;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

/**
 * @author KiroScarlet
 * @date 2019-08-11  -15:16
 * @title PinDuoDuo002
 * @project MyBookCodes
 * @desc TODO
 */
public class PinDuoDuo002 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int length = in.nextInt();
        int number = in.nextInt();

        int[] arr = new int[length];

        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < number; i++) {
            hashSet.add(in.nextInt());
        }

        for (int i = 0; i < length; i++) {
            if (hashSet.contains(i)) {
                arr[i] = 1;
            }
        }
//        System.out.println(Arrays.toString(arr));

        int count = Integer.MAX_VALUE;
        //构造一个数组作为插入排序用

        for  (Integer i : hashSet) {
            int[] arrSort = new int[length];
            for (int j = 0; j < length; j++) {
                arrSort[j] = arr[(j + i) % length];
            }
//            System.out.println(Arrays.toString(arrSort));

            //插入排序，把后面的珍珠插入到前面来，把所有为0的位置占满
            int flag = 0;
            int countTemp = 0;
            for (int j = 0; j < number; j++) {
                if (arrSort[j] == 0) {
                    int minMove = Integer.MAX_VALUE;
                    int kTmp = 0;

                    //找一个移动次数最少的
                    for (int k = number; k < length; k++) {

                        int tmpMove = Integer.MAX_VALUE;
                        if (arrSort[k] == 1) {
                            //还能从后往前移动，别忘了是个环
                            int rightCount = k - j;
                            int leftCount = length - rightCount;
                            if (rightCount < leftCount) {
                                tmpMove= rightCount;
                            } else {
                                tmpMove= leftCount;
                            }
                        }
                        if (tmpMove < minMove) {
                            minMove = tmpMove;
                            kTmp = k;
                        }
                    }
                    //替换移动次数最少的
                    arrSort[j] = 1;
                    arrSort[kTmp] = 0;
                    countTemp += minMove;

//                    System.out.println(countTemp);
//                    System.out.println(Arrays.toString(arrSort));
                }

            }

            if (countTemp < count) {
                count = countTemp;
            }

        }

        System.out.println(count);

    }
}
