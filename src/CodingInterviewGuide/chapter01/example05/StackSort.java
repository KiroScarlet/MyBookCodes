package CodingInterviewGuide.chapter01.example05;

import java.util.Stack;

/**
 * @author KiroScarlet
 * @date 2019-04-15  -10:20
 * 用一个栈实现另一个栈的排序
 */
public class StackSort {
    public static void sortStackByStack(Stack<Integer> stack) {
        Stack<Integer> help = new Stack<>();
        int cur;
        while (!stack.isEmpty()) {
            cur = stack.pop();
            while (!help.isEmpty() && cur > help.peek()) {
                stack.push(help.pop());
            }
            help.push(cur);
        }
        while (!help.isEmpty()) {
            stack.push(help.pop());
        }
    }
}
