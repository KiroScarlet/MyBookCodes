package NewCoderSolution.real2019.pinduoduo;

import java.util.*;

/**
 * @author KiroScarlet
 * @date 2019-05-06  -19:40
 */
public class PinDuoDuo04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        //n是需要相同的数量
        int n = scanner.nextInt();

        int[] nums = new int[m];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < m; i++) {
            int num = scanner.nextInt();
            nums[i] = num;
            if (!map.containsKey(num)) {
                map.put(num, 0);
            }
            map.put(num, map.get(num) + 1);
        }
        Set<Integer> set = map.keySet();
        int[] height = new int[4001];
        for (int temp : set) {
            height[temp] = map.get(temp);
        }
        int min = Integer.MAX_VALUE;
        for (int i = 2; i <= 4000; i++) {
            if (height[i] == 0) {
                continue;
            }
            int sum = 0;
            //需要填补的数量
            int count = n - height[i];
            for (int j = i - 1; j >= 1; j--) {
                if (height[j] != 0) {
                    //
                    if (count > height[j]) {
                        count -= height[j];
                        sum += (i - j) * height[j];
                    }
                    //否则直接填补完,然后判断
                    else {
                        sum += (i - j) * count;
                        min = Math.min(min, sum);
                        break;
                    }
                }
            }
        }
        System.out.println(min);
    }
}