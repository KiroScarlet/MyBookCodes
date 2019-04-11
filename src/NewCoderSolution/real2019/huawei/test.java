package NewCoderSolution.real2019.huawei;

import java.util.Scanner;

/**
 * @author KiroScarlet
 * @date 2019-04-10  -19:15
 */
public class test {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("输入两个字符串（小于100）：");
        String str1=s.next();
        String str2=s.next();
        while (str1.length()>100||str2.length()>100){
            System.out.println("输入不合法 ，请重新输入两个字符串（小于100）：");
            str1=s.next();
            str2=s.next();
        }
        char[] arr1=str1.toCharArray();
        char[] arr2=str2.toCharArray();
        Show(arr1);
        Show(arr2);
    }
    public static void Show( char[] arr){
        //判断字符组能分出几个长度为8的数组
        int count=arr.length/8 +1;
        //二维数组存放
        char[][] a=new char[count][8];
        //为数组赋值0
        for(int i=0;i<count;i++){
            for(int j=0;j<8;j++){
                a[i][j]='0';
            }
        }
        //将字符组赋值给二维数组
        for(int i=0;i<arr.length;i++){
            a[i/8][i%8]=arr[i];
        }
//遍历输出
        for(int i=0;i<count;i++){
            for(int j=0;j<8;j++){
                System.out.print(a[i][j] + "");
            }
            System.out.println();
        }
    }

}
