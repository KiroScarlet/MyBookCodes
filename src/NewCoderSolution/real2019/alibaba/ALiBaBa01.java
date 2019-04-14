package NewCoderSolution.real2019.alibaba;

import java.util.Arrays;

/**
 * @author KiroScarlet
 * @date 2019-04-12  -20:52
 */
public class ALiBaBa01 {
    public static void main(String[] args) {
        System.out.print(getNumber(20)+",");
        System.out.print(getBirthYear(20)+",");
        System.out.print(getTopK(20, 3));
    }

    private static int getNumber(int num) {
        if (num == 1) {
            return 2;
        }
        if (num == 2) {
            return 3;
        }if (num == 3) {
            return 4;
        }
        return getNumber(num - 2) + getNumber(num - 3);
    }

    private static int getBirthYear(int num) {
        int year = 2019;
        int a = 1;
        int b = 0;
        //成熟第一年
        int c = 0;
        int d = 1;
        //成熟第三年

        while (a + b + c + d < num) {
            year ++;
            int birth = c + d;
            d += c;
            c = b;
            b = a;
            a = birth;
        }
        return year;
    }

    private static int getTopK(int num, int k) {
        int[] nums = new int[num];
        nums[0] = 2;
        nums[1] = 3;
        nums[2] = 4;
        for (int i = 3; i < nums.length; i++) {
            nums[i] = getNumber(i);
        }
        String[] strs = new String[num];
        for (int i = 0; i < strs.length; i++) {
            StringBuffer sb = new StringBuffer();
            int tmp = nums[i];
            while (tmp != 0) {
                sb.append(tmp % 10);
                tmp /= 10;
            }
            strs[i] = sb.toString();
        }
        int[] newNums = new int[nums.length];
        for (int i = 0; i <newNums.length; i++) {
            newNums[i] = Integer.valueOf(strs[i]);
        }
        Arrays.sort(newNums);
        int number = newNums[newNums.length - k + 1];
        String result = String.valueOf(number);
        char[] chars = result.toCharArray();
        for (int i = 0; i < chars.length / 2; i++) {
            char temp = chars[i];
            chars[i] = chars[chars.length - 1 - i];
            chars[chars.length - 1 - i] = temp;
        }
        int temp = Integer.valueOf(new String(chars));
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == temp) {
                return i ;
            }
        }
        return 0;
    }
}