package NewCoderSolution.real2019.alibaba;

/**
 * @author KiroScarlet
 * @date 2019-04-12  -19:50
 * 输入:
商品总种类n,包裹限定总体积v,包裹限定总重量m(接下来会有n行)
商品1体积,商品1重量,商品1库存,商品1价格,商品1类型
商品2体积,商品2重量,商品2库存,商品2价格,商品2类型
商品3体积,商品3重量,商品3库存,商品3价格,商品3类型
输出:
购物车里商品的总价值
输入范例:
3,40,30
10,10,10,10,1
13,10,12,11,3
3,4,6,5,3
输出范例:
33
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ALiBaBa02 {

/** 请完成下面这个函数，实现题目要求的功能 **/
    /** 当然，你也可以不按照这个模板来作答，完全按照自己的想法来 ^-^  **/
    private static int totalPrice(int categoryCount, int totalVolume, int totalWeight, int[] volume, int[] weight,
                                  int[] stock, int[] price, int[] itemType) {

        int sumStock;
        return 0;

    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] line = in.nextLine().split(",");
        //总共商品种类
        int categoryCount = Integer.valueOf(line[0]);
        //快递体积
        int totalVolume = Integer.valueOf(line[1]);
        //快递重量
        int totalWeight = Integer.valueOf(line[2]);

        //物品体积
        int[] volume = new int[50];
        //重量
        int[] weight = new int[50];
        //件数
        int[] stock = new int[50];
        //价格
        int[] price = new int[50];
        //类型
        int[] itemType = new int[50];

        for (int i = 1; i <= categoryCount; i++) {
            line = in.nextLine().split(",");
            volume[i] = Integer.valueOf(line[0]);
            weight[i] = Integer.valueOf(line[1]);
            stock[i] = Integer.valueOf(line[2]);
            price[i] = Integer.valueOf(line[3]);
            itemType[i] = Integer.valueOf(line[4]);
        }

        in.close();

        System.out.println(totalPrice(categoryCount, totalVolume, totalWeight, volume, weight, stock, price, itemType));

    }
}
