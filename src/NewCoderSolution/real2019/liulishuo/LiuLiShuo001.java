package NewCoderSolution.real2019.liulishuo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author KiroScarlet
 * @date 2019-08-19  -19:42
 * @title LiuLiShuo001
 * @project MyBookCodes
 * @desc TODO
 */
public class LiuLiShuo001 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number;
        ArrayList<Integer> arrayList = new ArrayList<>();
        while (in.hasNext()) {
            arrayList.add(in.nextInt());
        }
        number = arrayList.size() / 2;
        int[] arr = new int[number * 2];
        int flag = 0;
        for (Integer integer : arrayList) {
            arr[flag] = integer;
            flag++;
        }

        int maxCount = 0;
        for (int i = 0; i < number-1; i++) {
            int countTmp = 0;
            for (int j = i + 1; j < number; j++) {
                if (arr[i] >= arr[j] && arr[i + number] < arr[j + number]) {
                    countTmp++;
                }
            }
            if (countTmp > maxCount) {
                maxCount = countTmp;
            }
        }

        System.out.println(maxCount);
    }
}
