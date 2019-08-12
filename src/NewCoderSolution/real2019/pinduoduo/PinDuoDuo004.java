package NewCoderSolution.real2019.pinduoduo;

import sun.reflect.generics.tree.Tree;

import java.util.*;

/**
 * @author KiroScarlet
 * @date 2019-08-11  -16:31
 * @title PinDuoDuo004
 * @project MyBookCodes
 * @desc TODO
 */
public class PinDuoDuo004 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int m = in.nextInt();
        HashMap<Integer, TreeSet<Integer>> hashSetHashMap = new HashMap<>();
        for (int i = 0; i < number; i++) {
            hashSetHashMap.put(i + 1, new TreeSet<>());
        }

        for (int i = 0; i < m; i++) {
            int tmp = in.nextInt();
            int tmp2 = in.nextInt();
            TreeSet<Integer> hashSet = hashSetHashMap.get(tmp);
            hashSet.add(tmp2);
        }

        TreeSet<Integer> treeSet = new TreeSet<>();
        for (int i = 0; i < number; i++) {
            treeSet.add(i + 1);
        }
        int count = 0;
        while (!treeSet.isEmpty()) {
            count++;
            int first = treeSet.first();
            treeSet.remove(first);
            TreeSet<Integer> treeSetRoad = null;

            while (true) {

                treeSetRoad = hashSetHashMap.get(first);

                if (treeSetRoad.isEmpty()) {
                    break;
                }


                int firstRoad = treeSetRoad.first();


                first = firstRoad;
                treeSet.remove(first);
            }
        }

        System.out.println(count);

    }
}
