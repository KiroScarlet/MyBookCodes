package NewCoderSolution.real2019.wangyi;

import java.util.Scanner;

/**
 * @author KiroScarlet
 * @date 2019-08-03  -16:00
 * @title WangYi03
 * @project MyBookCodes
 * @desc TODO
 */
public class WangYi03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = in.nextInt();
        }
        //冒泡排序，只有和为奇数才能交换

        for (int i = 0; i < n-1; i++) {
            int flag = 0;
            for (int j = i + 1; j < n; j++) {
                if ((numbers[i] > numbers[j])
                        && ((numbers[i] + numbers[j]) % 2 == 1)) {
                    int tmp;
                    tmp = numbers[j];
                    numbers[j] = numbers[i];
                    numbers[i] = tmp;
                }
            }
        }
        for (int number : numbers) {
            System.out.print(number+" ");
        }

    }
}
