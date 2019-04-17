package NewCoderSolution.offer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * @author KiroScarlet
 * @date 2019-04-17  -15:19
 * 题目描述
输入一个字符串,按字典序打印出该字符串中字符的所有排列。例如输入字符串abc,则打印出由字符a,b,c所能排列出来的所有字符串abc,acb,bac,bca,cab和cba。
输入描述:
输入一个字符串,长度不超过9(可能有字符重复),字符只包括大小写字母。
 */
public class Offer27_2 {

    /**
     * 1、递归算法
     *
     * 解析：http://www.cnblogs.com/cxjchen/p/3932949.html  (感谢该文作者！)
     *
     * 对于无重复值的情况
     *
     * 固定第一个字符，递归取得首位后面的各种字符串组合；
     * 再把第一个字符与后面每一个字符交换，并同样递归获得首位后面的字符串组合；
     * 递归的出口，就是只剩一个字符的时候，递归的循环过程，就是从每个子串的第二个字符开始依次与第一个字符交换，然后继续处理子串。
     *
     * 假如有重复值呢？
     * 一种比较简单的想法，在加入的时候判断重复值
     *
     */

    public ArrayList<String> Permutation(String str) {

        ArrayList<String> result = new ArrayList<>();
        if (str != null && str.length() > 0) {
            PermutationHelper(str.toCharArray(), 0, result);
            Collections.sort(result);
        }
        return result;
    }

    private void PermutationHelper(char[] chars, int i, ArrayList<String> result) {
        //这是递归的终止条件，就是i下标已经移到char数组的末尾的时候，考虑添加这一组字符串进入结果集中
        if (i >= chars.length - 1) {
            //判断是否重复
            if (!result.contains(String.valueOf(chars))) {
                result.add(String.valueOf(chars));
            }
        } else {
            Set<Character> charSet = new HashSet<>();
            for (int j = i; j < chars.length; j++) {
               swap(chars, i, j);
               PermutationHelper(chars, i + 1, result);
               swap(chars, j, i);
            }
        }
    }


    private void swap(char[] chars, int i, int j) {
        char tmp = chars[i];
        chars[i] = chars[j];
        chars[j] = tmp;
    }
}
