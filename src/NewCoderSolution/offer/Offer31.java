package NewCoderSolution.offer;

/**
 * @author KiroScarlet
 * @date 2019-05-05  -16:40
 * 题目描述
求出1~13的整数中1出现的次数,并算出100~1300的整数中1出现的次数？为此他特别数了一下1~13中包含1的数字有1、10、11、12、13因此共出现6次,
但是对于后面问题他就没辙了。ACMer希望你们帮帮他,并把问题更加普遍化,可以很快的求出任意非负整数区间中1出现的次数（从1 到 n 中1出现的次数）。
 */
public class Offer31 {
    //暴力求解
    public int NumberOf1Between1AndN_Solution(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            String number = String.valueOf(i);
            for (int j = 0; j < number.length(); j++) {
                if (number.charAt(j) == '1') {
                    count++;
                }
            }
        }
        return count;
    }
}
