package CodingInterviewGuide.chapter01.example02;

import org.junit.Test;

import java.util.Stack;

/**
 * @author KiroScarlet
 * @date 2019-04-14  -22:13
 * 由两个栈组成的队列
 */
public class TwoStacksQueue {
    public Stack<Integer> stackPush;
    public Stack<Integer> stackPop;

    public TwoStacksQueue() {
        stackPush = new Stack<>();
        stackPop = new Stack<>();
    }

    public void add(int pushInt) {
        stackPush.push(pushInt);
    }

    public int poll() {
/*
//这种做法效率不高
        while (!stackPush.isEmpty()) {
            stackPop.push(stackPush.pop());
        }
        int topValue = stackPop.peek();
        stackPop.pop();
        while (!stackPop.isEmpty()) {
            stackPush.push(stackPop.pop());
        }
        return topValue;
*/
        if (stackPush.empty() && stackPop.empty()) {
            throw new RuntimeException("Queue is empty");
        } else if (stackPop.empty()) {
            while (!stackPush.empty()) {
                stackPop.push(stackPush.pop());
            }
        }
        return stackPop.pop();
    }

    public int peek() {


        if (stackPush.empty() && stackPop.empty()) {
            throw new RuntimeException("Queue is empty");
        } else if (stackPop.empty()) {
            while (!stackPush.empty()) {
                stackPop.push(stackPush.pop());
            }
        }
        return stackPop.peek();
    }

    @Test
    public void test() {
        TwoStacksQueue myQueue = new TwoStacksQueue();
        myQueue.add(3);
        myQueue.add(56);
        myQueue.add(5666);
        myQueue.add(234);
        System.out.println(myQueue.peek());
        System.out.println(myQueue.poll());
        System.out.println(myQueue.poll());
        System.out.println(myQueue.peek());
        System.out.println(myQueue.poll());
    }
}
