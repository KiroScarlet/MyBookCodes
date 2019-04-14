package NewCoderSolution.real2018;

import java.util.Scanner;

/**
 * @author KiroScarlet
 * @date 2019-04-12  -16:07
 * 题目描述
小易为了向他的父母表现他已经长大独立了,他决定搬出去自己居住一段时间。一个人生活增加了许多花费:
小易每天必须吃一个水果并且需要每天支付x元的房屋租金。当前小易手中已经有f个水果和d元钱,小易也能去商店购买一些水果,商店每个水果售卖p元。
小易为了表现他独立生活的能力,希望能独立生活的时间越长越好,小易希望你来帮他计算一下他最多能独立生活多少天。
输入描述:
输入包括一行,四个整数x, f, d, p(1 ≤ x,f,d,p ≤ 2 * 10^9),以空格分割
输出描述:
输出一个整数, 表示小易最多能独立生活多少天。
示例1
输入
复制
3 5 100 10
输出
复制
11
 */
public class Real09 {
    //只有两种情况,已有水果个数比现有的钱除以房钱的次数多，此时以开房天数来算，
    //否则，就把水果卖了换钱，再用钱除以水果加房钱总和
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt(), f = in.nextInt(), d = in.nextInt(), p = in.nextInt();
        if ((f * x )>= d) {
            System.out.println(d / x);
        } else {
            System.out.println((d - f * x) / (p + x) + f);

        }
    }
}
