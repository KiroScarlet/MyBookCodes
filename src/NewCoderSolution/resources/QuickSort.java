package NewCoderSolution.resources;

import java.util.Arrays;

/**
 * @author KiroScarlet
 * @date 2019-08-11  -12:59
 * @title QuickSort
 * @project MyBookCodes
 * @desc 快速排序算法
 */
public class QuickSort {


    public static void quickSort(int[] arr,int low,int high){
        int i,j,temp,t;
        if(low>high){
            return;
        }
        i=low;
        j=high;
        //temp就是基准位,这里每次取最左边的一个
        temp = arr[low];

        while (i<j) {
            //先看右边，依次往左递减
            while (temp<=arr[j]&&i<j) {
                j--;
            }
            //再看左边，依次往右递增
            while (temp>=arr[i]&&i<j) {
                i++;
            }
            //如果满足条件则交换
            if (i<j) {
                t = arr[j];
                arr[j] = arr[i];
                arr[i] = t;
            }

        }
        // 这时候，跳出上面大的while循环之后，i和j肯定是相等的，因为上面循环的条件是i<j，所以，跳出循环时，i和j是相等的
        //下面的i和j其实相等的，所以用哪一个都一样。
        //最后将基准为与i和j相等位置的数字交换
        arr[low] = arr[i];
        arr[i] = temp;
        //递归调用左半数组
        quickSort(arr, low, i-1);
        //递归调用右半数组
        quickSort(arr, i+1, high);
    }


    public static void main(String[] args) {
        int[] arr = {19, 123, 4, 5, 7, 98, 9, 34, 2, 2, 34, 234, 234344, 22, 1, 3, 6, 7};
        quickSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
