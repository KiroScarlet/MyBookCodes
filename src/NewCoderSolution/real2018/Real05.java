package NewCoderSolution.real2018;

import java.util.HashSet;
import java.util.Scanner;

/**
 * @author KiroScarlet
 * @date 2019-04-09  -16:59
 * 彩色的砖块
 *
小易有一些彩色的砖块。每种颜色由一个大写字母表示。各个颜色砖块看起来都完全一样。
现在有一个给定的字符串s,s中每个字符代表小易的某个砖块的颜色。小易想把他所有的砖块排成一行。
如果最多存在一对不同颜色的相邻砖块,那么这行砖块就很漂亮的。请你帮助小易计算有多少种方式将他所有砖块排成漂亮的一行。
(如果两种方式所对应的砖块颜色序列是相同的,那么认为这两种方式是一样的。)
例如: s = "ABAB",那么小易有六种排列的结果:
"AABB","ABAB","ABBA","BAAB","BABA","BBAA"
其中只有"AABB"和"BBAA"满足最多只有一对不同颜色的相邻砖块。
输入描述:
输入包括一个字符串s,字符串s的长度length(1 ≤ length ≤ 50),s中的每一个字符都为一个大写字母(A到Z)。
输出描述:
输出一个整数,表示小易可以有多少种方式。
示例1
输入
复制
ABAB
输出
复制
2
 */
public class Real05 {
//    对每种颜色砖块个数做统计：
//    如果出现了两种以上的颜色，肯定最少有两种相邻，直接输出0.
//    如果出现了一种，那就只有一种。
//    如果出现了两种，那就只有两种。

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        HashSet<Character> hashSet = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            hashSet.add(s.charAt(i));

            // 如果一旦有两种以上的字符就输出0
            if (hashSet.size() > 2) {
                System.out.println(0);
                return;
            }
        }
        // 有两种字符就输出2，有一种字符就输出1
        System.out.println(hashSet.size());
    }
}
