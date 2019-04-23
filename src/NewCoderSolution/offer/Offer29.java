package NewCoderSolution.offer;

import org.junit.Test;

import java.util.*;

/**
 * @author KiroScarlet
 * @date 2019-04-21  -23:40
 * 题目描述
 * 输入n个整数，找出其中最小的K个数。例如输入4,5,1,6,2,7,3,8这8个数字，则最小的4个数字是1,2,3,4,。
 */
public class Offer29 {
    //用最大堆保存这k个数，每次只和堆顶比，如果比堆顶小，删除堆顶，新数入堆。
    public ArrayList<Integer> GetLeastNumbers_Solution(int[] input, int k) {
        ArrayList<Integer> result = new ArrayList<>();
        if (input == null || input.length <= 0 || input.length < k) {
            return result;
        }
        //使用优先队列实现堆
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(k, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });

        for (int i = 0; i < input.length; i++) {
            if (maxHeap.size() != k) {
                maxHeap.offer(input[i]);
            } else if (maxHeap.peek() > input[i]) {
                maxHeap.poll();
                maxHeap.offer(input[i]);
            }
        }

        for (Integer integer : maxHeap) {
            result.add(integer);
        }
        return result;
    }

    @Test
    public void test() {
        int[] input = {1, 4, 5, 6, 6, 7, 8, 1234, 11234, 1112, 34445, 667, 6, 3};
        int k=4;
        ArrayList<Integer> arrayList = GetLeastNumbers_Solution(input, k);
        System.out.println(arrayList);
    }


}