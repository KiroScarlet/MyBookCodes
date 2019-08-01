package NewCoderSolution.offer;

import org.junit.Test;
import sun.text.normalizer.IntTrie;

import java.util.ArrayList;

/**
 * @author KiroScarlet
 * @date 2019-05-05  -21:27
 * 题目描述
    在数组中的两个数字，如果前面一个数字大于后面的数字，则这两个数字组成一个逆序对。
    输入一个数组,求出这个数组中的逆序对的总数P。并将P对1000000007取模的结果输出。 即输出P%1000000007
    输入描述:
    题目保证输入的数组中没有的相同的数字

    数据范围：
    对于%50的数据,size<=10^4
    对于%75的数据,size<=10^5
    对于%100的数据,size<=2*10^5

    示例1
    输入
    1,2,3,4,5,6,7,0
    输出
    7
 */
public class Offer35 {

    @Test
    public void test() {
        Offer35 test = new Offer35();
        int[] array = {1, 2, 3, 4, 5, 6, 7, 0};
        System.out.println(test.InversePairs(array));
    }

    /**
      * @Author KiroScarlet
      * @Description 双层循环会导致运行时间超限，要想其他方法，使用分治法，借鉴归并排序的思想
      * @Date 2019-07-28 -18:56
      * @param array:
      * @return int
      **/
    //统计逆序对的个数
    int cnt;
    public int InversePairs(int [] array) {
        if(array.length != 0){
            divide(array,0,array.length-1);
        }
        return cnt;
    }

    //归并排序的分治---分
    private void divide(int[] arr,int start,int end){
        //递归的终止条件
        if(start >= end)
            return;
        //计算中间值，注意溢出
        int mid = start + (end - start)/2;

        //递归分
        divide(arr,start,mid);
        divide(arr,mid+1,end);

        //治
        merge(arr,start,mid,end);
    }

    private void merge(int[] arr,int start,int mid,int end){
        int[] temp = new int[end-start+1];

        //存一下变量
        int i=start,j=mid+1,k=0;
        //下面就开始两两进行比较，若前面的数大于后面的数，就构成逆序对
        while(i<=mid && j<=end){
            //若前面小于后面，直接存进去，并且移动前面数所在的数组的指针即可
            if(arr[i] <= arr[j]){
                temp[k++] = arr[i++];
            }else{
                temp[k++] = arr[j++];
                //a[i]>a[j]了，那么这一次，从a[i]开始到a[mid]必定都是大于这个a[j]的，因为此时分治的两边已经是各自有序了
                cnt = (cnt+mid-i+1)%1000000007;
            }
        }
        //各自还有剩余的没比完，直接赋值即可
        while(i<=mid)
            temp[k++] = arr[i++];
        while(j<=end)
            temp[k++] = arr[j++];
        //覆盖原数组
        for (k = 0; k < temp.length; k++)
            arr[start + k] = temp[k];
    }
}