package NewCoderSolution.real2018;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author KiroScarlet
 * @date 2019-04-08  -15:11
 */
/*题目描述
        六一儿童节，老师带了很多好吃的巧克力到幼儿园。每块巧克力j的重量为w[j]，对于每个小朋友i，当他分到的巧克力大小达到h[i]
        (即w[j]>=h[i])，他才会上去表演节目。老师的目标是将巧克力分发给孩子们，使得最多的小孩上台表演。
        可以保证每个w[i]> 0且不能将多块巧克力分给一个孩子或将一块分给多个孩子。
        输入描述:
        第一行：n，表示h数组元素个数
        第二行：n个h数组元素
        第三行：m，表示w数组元素个数
        第四行：m个w数组元素
        输出描述:
        上台表演学生人数

        示例1
        输入
        3
        2 2 3
        2
        3 1
        输出
        1*/
public class Real03 {
    //贪心算法，两个数组分别排序，吃的最少的小朋友拿能满足上台需求的最小的巧克力
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int childNum=in.nextInt();
        int[] child=new int[childNum];
        for (int i = 0; i < childNum; i++) {
            child[i] = in.nextInt();
        }
        int chocNum=in.nextInt();
        int[] choc=new int[chocNum];
        for (int i = 0; i < chocNum; i++) {
            choc[i] = in.nextInt();
        }

        int count = 0;
        Arrays.sort(child);
        Arrays.sort(choc);

        int childFlag=0;

        for (int i = 0; i < choc.length; i++) {
            if (childFlag >= childNum) {// 如果最后一个学生都有糖了,就不找了,break掉
                break;
            }
            if (choc[i] < child[childFlag]) {// 如果最小的巧克力比最小的学生要的小,那么跳出去下一个巧克力
                continue;
            }else{// 如果最小的巧克力比最小的学生要的大
                count++;
                childFlag++;
            }
        }
        System.out.println(count);
    }
}
