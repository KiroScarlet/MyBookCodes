package NewCoderSolution.real2019.wangyi;

import java.util.Scanner;

/**
 * @author KiroScarlet
 * @date 2019-08-03  -15:47
 * @title WangYi04
 * @project MyBookCodes
 * @desc TODO
 */
public class WangYi04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int quest = in.nextInt();
        int[] numbers = new int[number];
        for (int i = 0; i < number; i++) {
            numbers[i] = in.nextInt();
        }

        int[] quests = new int[quest];
        for (int i = 0; i < quest; i++) {
            quests[i] = in.nextInt();
        }

        for (int i = 0; i < quests.length; i++) {
            int count = 0;
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[j] >= quests[i]) {
                    count++;
                    numbers[j]--;
                }
            }

            System.out.println(count);

        }
    }
}
