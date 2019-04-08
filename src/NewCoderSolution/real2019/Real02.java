package NewCoderSolution.real2019;


import java.util.Arrays;
import java.util.Scanner;

/**
 * @author KiroScarlet
 * @date 2019-04-08  -20:17
 */
public class Real02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String linkList=in.nextLine();
        int n = in.nextInt();
        System.out.println(n);
        String[] nodeVal = (linkList.substring(1, linkList.length() - 1)).split(",");
        System.out.println(Arrays.toString(nodeVal));


        String tmp;

        for (int i = 0; i < nodeVal.length / n; i++) {
            int left = n * i, right = n * i + n-1;
            for (int j = left; j < right/ 2; j++) {
                tmp = nodeVal[j];
                nodeVal[j] = nodeVal[right - j];
                nodeVal[right - j] = tmp;
            }
        }

        System.out.println(Arrays.toString(nodeVal));
    }
}
