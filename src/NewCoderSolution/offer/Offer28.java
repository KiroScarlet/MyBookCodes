package NewCoderSolution.offer;

import java.util.HashMap;
import java.util.Map;

/**
 * @author KiroScarlet
 * @date 2019-04-17  -16:13
 * 题目描述
数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
例如输入一个长度为9的数组{1,2,3,2,2,2,5,4,2}。由于数字2在数组中出现了5次，超过数组长度的一半，因此输出2。如果不存在则输出0。
 */
public class Offer28 {
    public int MoreThanHalfNum_Solution(int [] array) {
        /*
         * 利用map存值，找出存在最多的数字，若大于长度一半，返回此数，否则返回0
         */
        if (array.length == 0 || array == null) {
            return 0;
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            if (map.containsKey(array[i])) {
                map.put(array[i], map.get(array[i]) + 1);
            } else {
                map.put(array[i], 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > array.length / 2) {
                return entry.getKey();
            }
        }
        return 0;
    }
}