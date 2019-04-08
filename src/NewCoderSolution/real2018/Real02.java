package NewCoderSolution.real2018;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author KiroScarlet
 * @date 2019-04-08  -12:04
 *
有两个用字符串表示的非常大的大整数,算出他们的乘积，也是用字符串表示。不能用系统自带的大整数类型。
输入描述:
空格分隔的两个字符串，代表输入的两个大整数
输出描述:
输入的乘积，用字符串表示

示例1
输入
72106547548473106236 982161082972751393
输出
70820244829634538040848656466105986748
 */
public class Real02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String num1 = in.next();
        String num2 = in.next();
        int[] result = new int[num1.length() + num2.length()-1];

        //先不考虑进位，把每个位置的数存储下来
        for (int i = 0; i  <num1.length(); i++) {
            for (int j = 0; j <num2.length(); j++) {
                result[i + j] += (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
            }
        }

        StringBuffer s = new StringBuffer();

        //大于10就进位
        for (int i =result.length-1; i >0; i--) {
            result[i - 1] += result[i] / 10;
            result[i] = result[i] % 10;
        }

        for (int i = 0; i < result.length; i++) {
            s.append(result[i]);
        }

        System.out.println(s);
    }
}
