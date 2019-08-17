package NewCoderSolution.real2019.xunfei;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author KiroScarlet
 * @date 2019-08-16  -18:28
 * @title XunFei001
 * @project MyBookCodes
 * @desc TODO
 */
public class XunFei001 {
    public static void main(String[] args) {
        String str = "爱讯飞789swr1wwen34ifly65tek";

        ArrayList<Integer> result = getNumber(str);
        if (result.size() == 0) {
            System.out.println(-1);
        } else {
            for (Integer integer : result) {
                System.out.print(integer);
            }
        }
    }

    //得到一个字符串中的所有数字，并且从小到大排列
    private static ArrayList<Integer> getNumber(String str) {
        //把字符串转换为字符数组
        char[] chars = str.toCharArray();
        //创建一个list保存所有的数字
        ArrayList<Integer> numberArray = new ArrayList<>();
        //遍历字符数组，找到其中所有的数字
        for (char aChar : chars) {
            if (aChar >= '0' && aChar <= '9') {

                numberArray.add(aChar - '0');
            }

            //排序
            Collections.sort(numberArray);
        }
        return numberArray;
    }
}
