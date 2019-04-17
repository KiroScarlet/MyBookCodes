package CodingInterviewGuide.chapter01.example07;

import org.junit.Test;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * @author KiroScarlet
 * @date 2019-04-15  -12:14
 * 生成窗口最大值数组
 */
public class MaxWindow {
    public int[] getMaxWindow(int[] arr, int w) {
        if (arr == null || w < 1 || arr.length < w) {
            return null;
        }
        LinkedList<Integer> qmax = new LinkedList<>();
        int[] res = new int[arr.length - w + 1];
        int index = 0;

        for (int i = 0; i < arr.length; i++) {

            //维持一个双端队列qmax，其队列头元素为窗口最大值
            while (!qmax.isEmpty() && arr[qmax.peekLast()] <= arr[i]) {
                qmax.pollLast();
            }
            qmax.addLast(i);
            if (qmax.peekFirst() == i - w) {
                qmax.pollFirst();
            }
            if (i >= w - 1) {
                res[index++] = arr[qmax.peekFirst()];
            }
        }
        return res;
    }

    @Test
    public void test() {
        int[] testArray = {4, 2, 5, 4, 3, 3, 6, 7};
        int[] result = getMaxWindow(testArray, 3);
        System.out.println(Arrays.toString(result));
    }
}
