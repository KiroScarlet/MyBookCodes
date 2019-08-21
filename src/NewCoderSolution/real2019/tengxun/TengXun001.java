package NewCoderSolution.real2019.tengxun;

import java.util.Scanner;
import java.util.Stack;

/**
 * @author KiroScarlet
 * @date 2019-08-17  -20:16
 * @title TengXun001
 * @project MyBookCodes
 * @desc TODO
 */
public class TengXun001 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        char[] chars = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < chars.length; i++) {
            stack.push(chars[i]);
        }

        System.out.println(s);




    }
}
