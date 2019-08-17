package NewCoderSolution.real2019.xunfei;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author KiroScarlet
 * @date 2019-08-16  -18:28
 * @title XunFei002
 * @project MyBookCodes
 * @desc TODO
 */
public class XunFei002 {
    public static void main(String[] args) {

        int[] arr = {11, 13, 15, 17, 19, 21};

        int result = bianrySearch(arr, 19, 0, arr.length - 1);

        if (result == -1) {
            System.out.println(-1);
        } else {
            //输出所在的位置
            System.out.println(result + 1);
        }

    }

    //二分查找,输出数组下标
    private static int bianrySearch(int[] arr, int key, int low, int high) {
        if(key < arr[low] || key > arr[high] || low > high){
            return -1;
        }
        //定义中间数的下标mid
        int mid = (low + high) / 2;

        //如果待查找的数字小于中间数，则在左半部分查找
        if(arr[mid] > key){
            return bianrySearch(arr, key, low, mid - 1);
        }else if(arr[mid] < key){
            //如果待查找的数字大于中间数，则在右半部分查找
            return bianrySearch(arr, key, mid + 1, high);
        }else {
            //找到了这个数字
            return mid;
        }
    }
}