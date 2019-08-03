package NewCoderSolution.real2019;

import java.util.*;

/**
 * @author KiroScarlet
 * @date 2019-08-02  -12:44
 * @title Real2019001
 * @project MyBookCodes
 * @desc 牛牛找工作
 */
public class Real2019001 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int member = in.nextInt();

        Map<Integer, Integer> treeMap = new TreeMap<>();

        //把工作和报酬放到map中
        for (int i = 0; i < number; i++) {
            int Di = in.nextInt();
            int Pi = in.nextInt();
            if (treeMap.containsKey(Di)) {
                if (Pi > treeMap.get(Di)) {
                    treeMap.put(Di, Pi);
                }
            } else {
                treeMap.put(Di, Pi);
            }
        }



        int[] members = new int[member];

        //把小伙伴的能力值也放进去
        for (int i = 0; i < member; i++) {
            int Vi = in.nextInt();
            members[i] = Vi;
            //如果原map里面没有，设置为0
            if (!treeMap.containsKey(Vi)) {
                treeMap.put(Vi, 0);
            }
        }

//        System.out.println(treeMap.toString());

        //从小到大更新treeMap
        int tmp = 0;
        for (Map.Entry<Integer, Integer> entry : treeMap.entrySet()) {
            //如果薪酬小于比它难度简单的工作，则更新薪酬
            if (entry.getValue() < tmp) {
                entry.setValue(tmp);
            }
            tmp = entry.getValue();
        }


//        System.out.println(treeMap.toString());
        //输出结果
        for (int i = 0; i < member; i++) {
            System.out.println(treeMap.get(members[i]));
        }

    }
}