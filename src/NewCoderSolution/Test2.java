package NewCoderSolution;

import java.util.Stack;

/**
 * @author KiroScarlet
 * @date 2019-03-31  -21:39
 */
public class Test2 {
    //利用一个辅助栈存放最小值
    private int min;
    private Stack<Integer> mainStack=new Stack<>();
    private Stack<Integer>  minStack=new Stack<>();

    public void push(int node) {
        mainStack.push(node);
        if (minStack.empty()){
            minStack.push(node);
        }else if(node<=minStack.peek()){
            minStack.push(node);
        }
    }

    public void pop() {
        if(mainStack.peek()==minStack.peek()){
            mainStack.pop();
            minStack.pop();
        }else{
            mainStack.pop();
        }

    }

    public int top() {
        return mainStack.peek();
    }

    public int min() {
        return minStack.peek();
    }

    public static void main(String[] args) {
        Test2 test2 = new Test2();
        test2.push(3);
        System.out.println(test2.top());
        test2.push(4);
        System.out.println(test2.top());
    }

}
