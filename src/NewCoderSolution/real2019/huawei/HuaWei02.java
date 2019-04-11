package NewCoderSolution.real2019.huawei;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

/**
 * @author KiroScarlet
 * @date 2019-04-10  -19:59
 */
public class HuaWei02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        char[] chars = s.toCharArray();
        Stack<Character> characters = new Stack<>();
        for (int i = 0; i < chars.length; i++) {
            characters.push(chars[i]);
        }
        ArrayList<Character> result = new ArrayList<>();
        while (!characters.empty()) {
            char c = characters.peek();

            if (c == ')') {
                char tmp;
                int num = 0;
                characters.pop();
                tmp = characters.pop();
                if (characters.pop() == '(') {
                    num = characters.pop() - '0';
                    while (num != 0) {
                        num--;
                        result.add(tmp);
                    }
                }
            } else {
                result.add(c);
                characters.pop();
            }


        }
        for (char c : result) {
            System.out.print(c);
        }
    }
}
