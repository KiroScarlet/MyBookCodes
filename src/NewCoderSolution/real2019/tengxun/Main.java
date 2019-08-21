import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int l = in.nextInt();
        //以当前点开始最长的真视守卫
        int[] max = new int[l];
//        System.out.println(Arrays.toString(max));
        for (int i = 0; i < n; i++) {
            int left = in.nextInt();
            int right = in.nextInt();
            if (left < l) {
                if (right > max[left]) {
                    max[left] = right;
                }
            }
        }

//        System.out.println(Arrays.toString(max));

        int start = 0;
        int right = max[start];
        int count = 1;
        while (right < l) {
            int maxLength = 0;
            for (int i = start + 1; i <= right; i++) {
                if (i < max.length) {
                    if (max[i] > maxLength) {
                        maxLength = max[i];
                    }
                }
            }
            if (maxLength == 0) {
                System.out.println(-1);
                return;
            }
            count++;
            start = right;
            right = maxLength;
        }

        System.out.println(count);
    }
}
