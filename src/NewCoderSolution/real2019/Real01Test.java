package NewCoderSolution.real2019;

import java.util.Scanner;

/**
 * @author KiroScarlet
 * @date 2019-04-08  -20:10
 */
public class Real01Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String linkListNode=in.next();
//        System.out.println(linkListNode);
        String[] nodeVal = linkListNode.split(",");
//        System.out.println(Arrays.toString(nodeVal));
        boolean result = false;
        for (int i = 0; i < nodeVal.length; i++) {
            for (int j = i + 1; j < nodeVal.length; j++) {
                if (nodeVal[i].equals(nodeVal[j])) {
                    result = true;
                }
            }
        }

        System.out.println(result);
    }
}
