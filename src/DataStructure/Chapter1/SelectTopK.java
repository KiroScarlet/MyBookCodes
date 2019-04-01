package DataStructure.Chapter1;


import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.SortedSet;

/**
 * @author KiroScarlet
 * @date 2019-03-14  -16:21
 */
public class SelectTopK {
    public static void main(String[] args) {
        int[] aTest = new int[100];
        for (int i = 0; i < aTest.length; i++) {
            aTest[i] = (int) (Math.random() * 100);
        }

        Scanner in = new Scanner(System.in);
        int k = in.nextInt();

        System.out.println(Arrays.toString(aTest));

        int[] result1 = new int[k];
        for (int i = 0; i < result1.length; i++) {
            result1[i] = aTest[i];
        }

        Arrays.sort(result1);

        int[] result = new int[k];

        for (int i = 0; i < result.length; i++) {
            result[result.length-1-i] = result1[i];

        }

        System.out.println(Arrays.toString(result));

        for (int i = result.length + 1; i < aTest.length; i++) {
            if (aTest[i] > result[result.length - 1]) {
                result[result.length - 1] = aTest[i];
                for (int j = result.length - 2; j >= 0; j--) {
                    if (result[j] < result[j + 1]) {
                        int tmp = result[j];
                        result[j] = result[j + 1];
                        result[j + 1] = tmp;
                    } else {
                        break;
                    }
                }
            }
        }

        System.out.println(Arrays.toString(result));
        Arrays.sort(aTest);

        System.out.println(Arrays.toString(aTest));
    }
}

