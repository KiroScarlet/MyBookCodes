package CodingInterviewGuide.chapter01.example03;

import java.util.Stack;

/**
 * @author KiroScarlet
 * @date 2019-04-14  -22:42
 * 使用递归函数逆序一个栈
 */

public class ReverseStack {
    public static int getAndRemoveLastElement(Stack<Integer> stack) {
        int result = stack.pop();
        if (stack.isEmpty()) {
            return result;
        } else {
            int last = getAndRemoveLastElement(stack);
            stack.push(result);
            return last;
        }
    }

    public static void reverse(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            return;
        }
        int i = getAndRemoveLastElement(stack);
        reverse(stack);
        stack.push(i);
    }
}
