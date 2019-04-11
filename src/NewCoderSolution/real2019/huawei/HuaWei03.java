package NewCoderSolution.real2019.huawei;

import java.util.*;

/**
 * @author KiroScarlet
 * @date 2019-04-10  -19:59
 */
public class HuaWei03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[][] map = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                map[i][j] = in.nextInt();
            }
        }
        int x = in.nextInt(), y = in.nextInt(), z = in.nextInt(), w = in.nextInt();
        int[][] flag = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                flag[i][j] = 0;
            }
        }

        Queue<String> queue = new LinkedList<>();
        queue.add(x + "," + y);
        String tmp;
        while (!queue.isEmpty()) {
            tmp = queue.poll();

        }

    }
}
