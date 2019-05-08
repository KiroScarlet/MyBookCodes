package NewCoderSolution.real2019.pinduoduo;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author KiroScarlet
 * @date 2019-05-06  -19:05
 */
public class PinDuoDuo01 {
    public static void main(String[] args) {

        ArrayList<Character> result = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        String s = in.next();
        for (int i = 0; i < s.length(); i++) {
            result.add(s.charAt(i));
        }
        int flag = 0;
        int count = 0;
        while (flag == 0) {
            for (int i = 0; i < result.size(); i++) {
                if (i == result.size()-1) {
                    flag = 1;
                    break;
                }
                if (result.get(i) == result.get(i + 1)) {
                    result.remove(i+1);
                    result.remove(i);
                    count++;
                    break;
                }
            }
        }
        System.out.println(count);
    }
}
