package NewCoderSolution.real2019.others;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author KiroScarlet
 * @date 2019-05-27  -19:07
 */
public class test1 {

    //[[1,1,0],[1,0,1],[0,0,0]]
    //[[1,1,0,0],[1,0,0,1],[0,1,1,1],[1,0,1,0]]
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] strings = s.split("],");
        System.out.println(Arrays.toString(strings));
        String[][] result = new String[strings.length][];
        for (int i = 0; i < strings.length; i++) {
            String s1 = strings[i].replace("[", "").replace("]", "");
            result[i] = s1.split(",");
            System.out.println(Arrays.toString(result[i]));

        }

        for (int i = 0; i < result.length; i++) {
            int lineLength = result[i].length;
            for (int j = 0; j < lineLength/2; j++) {
                String tmp = result[i][j];
                result[i][j] = result[i][lineLength - j - 1];
                result[i][lineLength - j - 1] = tmp;
            }
            System.out.println(Arrays.toString(result[i]));
        }

        for (int i = 0; i < result.length; i++) {
            int lineLength = result[i].length;
            for (int j = 0; j < lineLength; j++) {
                if (result[i][j].equals("0")) {
                    result[i][j] = "1";
                }else if (result[i][j].equals("1")) {
                    result[i][j] = "0";
                }
            }
            System.out.println(Arrays.toString(result[i]));
        }

        String[] out = new String[result.length];

        for (int i = 0; i < result.length; i++) {
            out[i] = (Arrays.toString(result[i]));
        }
        System.out.println(Arrays.toString(out));
    }
}
