package CodingInterviewGuide.chapter01.example01;

import org.junit.Test;

import java.util.Stack;

/**
 * @author KiroScarlet
 * @date 2019-04-12  -17:46
 * 实现一个特殊的栈，要求在实现栈的基本功能的基础上，再实现返回栈中最小元素的操作。
 */
public class MyStack1 {

    private Stack<Integer> stackData;
    private Stack<Integer> stackMin;

    public MyStack1() {
        this.stackData = new Stack<>();
        this.stackMin = new Stack<>();
    }

    public void push(int newNum) {
        stackData.push(newNum);
        if (stackMin.isEmpty()) {
            stackMin.push(newNum);
        } else {
            if (stackMin.peek() >= newNum) {
                stackMin.push(newNum);
            }
        }
    }

    public void pop() {
        if (stackData.pop() == stackMin.peek()) {
            stackMin.pop();
        }


    }

    public void getMin() {
        System.out.println(stackMin.peek());
    }

    @Test
    public void Test() {
        MyStack1 myStack1 = new MyStack1();
        myStack1.push(123);
        myStack1.push(444);
        myStack1.push(334);
        myStack1.push(22);
        myStack1.getMin();
        myStack1.pop();
        myStack1.pop();
        myStack1.getMin();

    }
}
