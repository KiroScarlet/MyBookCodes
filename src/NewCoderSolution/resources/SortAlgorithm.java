package NewCoderSolution.resources;

import java.util.Arrays;

/**
 * @author KiroScarlet
 * @date 2019-08-21  -11:50
 * @title SortAlgorithm
 * @project MyBookCodes
 * @desc 常见的排序算法
 */
public class SortAlgorithm {
    public static void main(String[] args) {
        int[] arr = {19, 123, 4, 5, 7, 98, 9, 34, 2, 2, 34, 234, 234344, 22, 1, 3, 6, 7,123333,11,1,23,44,6,8,9,0,2345,-2345,-2,-345};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void swap(int[] arr, int a, int b) {
        int temp = 0;
        temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    //冒泡排序
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }
    }
}
