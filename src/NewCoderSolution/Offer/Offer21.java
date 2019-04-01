package NewCoderSolution.Offer;

import java.util.Stack;

/**
 * @author KiroScarlet
 * @date 2019-03-31  -22:01
 */

//输入两个整数序列，第一个序列表示栈的压入顺序，请判断第二个序列是否可能为该栈的弹出顺序。
// 假设压入栈的所有数字均不相等。例如序列1,2,3,4,5是某栈的压入顺序，序列4,5,3,2,1是该压栈序列对应的一个弹出序列，
// 但4,3,5,1,2就不可能是该压栈序列的弹出序列。（注意：这两个序列的长度是相等的）
public class Offer21 {
    public boolean IsPopOrder(int [] pushA,int [] popA) {

        if (pushA == null && popA == null) {
            return true;
        }
        Stack<Integer> stack=new Stack<Integer>();
        int j=0;
        for (int i = 0; i < pushA.length; i++) {
            stack.push(pushA[i]);
            while (j < popA.length && stack.peek() == popA[j]) {
                stack.pop();
                j++;
            }
        }
        return stack.empty();
    }

    public static void main(String[] args) {
        Offer21 test=new Offer21();
        System.out.println(test.IsPopOrder(new int[]{1, 2, 3, 4, 5}, new int[]{4, 5, 3, 2, 1}));
    }
}
