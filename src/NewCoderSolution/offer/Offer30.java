package NewCoderSolution.offer;

/**
 * @author KiroScarlet
 * @date 2019-05-05  -16:28
 * 题目描述
HZ偶尔会拿些专业问题来忽悠那些非计算机专业的同学。今天测试组开完会后,他又发话了:在古老的一维模式识别中,
常常需要计算连续子向量的最大和,当向量全为正数的时候,问题很好解决。但是,如果向量中包含负数,是否应该包含某个负数,
并期望旁边的正数会弥补它呢？例如:{6,-3,-2,7,-15,1,2,2},连续子向量的最大和为8(从第0个开始,到第3个为止)。
给一个数组，返回它的最大连续子序列的和，你会不会被他忽悠住？(子向量的长度至少是1)
 */
public class Offer30 {
    public int FindGreatestSumOfSubArray(int[] array) {
        //书本的解法，遍历，遇到负和抛弃之前的结果，重新积累，期间保留最大值
        int max = array[0], current = 0;// max存储最大和，不能初始为0，存在负数
        for (int i = 0; i < array.length; i++) {
            if (current < 0) {// 当前和<0，抛弃不要
                current = array[i];
            } else {
                current += array[i];
            }
            if (max < current) {// 存储最大结果
                max = current;
            }
        }
        return max;
    }
}