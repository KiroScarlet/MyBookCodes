package NewCoderSolution.offer;

import org.junit.Test;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @author KiroScarlet
 * @date 2019-04-22  -9:30
 * 堆的测试
 */
public class Offer29Test {

    @Test
    public void test() {

        int[] input = {1, 4, 5, 6, 6, 7, 8, 1234, 11234, 1112, 34445, 667, 6, 3};
        int k=4;

        //使用优先队列实现堆
        PriorityQueue<Integer> maxHeap=new PriorityQueue<>(k, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
//                return o2.compareTo(o1);
                return o1.compareTo(o2);
            }
        });

        for (int i = 0; i < input.length; i++) {
            if (maxHeap.size() != k) {
                maxHeap.offer(input[i]);
//            } else if (maxHeap.peek() > input[i]) {
            } else if (maxHeap.peek() < input[i]) {
                maxHeap.poll();
                maxHeap.offer(input[i]);
            }
        }

        for (Integer integer : maxHeap) {
            System.out.print(integer+" ");
        }
    }

}
