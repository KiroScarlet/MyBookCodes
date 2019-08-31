package NewCoderSolution.real2019.xinlang;

import com.sun.xml.internal.ws.api.ha.StickyFeature;

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
public class Solution {
    Map<Integer, Integer> map;
    Stack<Integer> stack;
    int size;
    public Solution(int capacity) {
        this.stack = new Stack<>();
        this.map = new HashMap<>(capacity);
        size = capacity;
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
            if (stack.size() == size) {
                int count = stack.remove(0);
                map.remove(count);
            }
        }

        stack.push(key);
        map.put(key, value);
    }
}
