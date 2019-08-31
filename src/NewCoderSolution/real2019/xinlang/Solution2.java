package NewCoderSolution.real2019.xinlang;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @author KiroScarlet
 * @date 2019-08-31  -17:12
 * @title Solution
 * @project MyBookCodes
 * @desc TODO
 */
public class Solution2 {
    Map<Integer, Integer> map;
    Stack<Integer> stack;
    int capacity;
    public Solution2(int capacity) {
        this.stack = new Stack<>();
        this.map = new HashMap<>(capacity);
        capacity = capacity;
    }

    public int get(int key) {

        if (!stack.contains(key)) {
            return -1;
        }
        stack.remove(Integer.valueOf(key));
        stack.push(key);
        return map.get(key);
    }

    public void put(int key, int value) {

        if (stack.contains(key)) {
            stack.remove(Integer.valueOf(key));
        } else {
            if (stack.size() == capacity) {
                int count = stack.remove(0);
                map.remove(count);
            }
        }

        stack.push(key);
        map.put(key, value);
    }
}
