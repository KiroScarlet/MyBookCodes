package JavaGuide;

import java.util.*;

/**
 * @author KiroScarlet
 * @date 2019-04-22  -10:21
 * ArrayList测试
 */
public class ArrayListTest {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        System.out.printf("arrayList.size()=%d\n", arrayList.size());
        arrayList.add(1);
        arrayList.add(3);
        arrayList.add(5);
        arrayList.add(7);
        arrayList.add(9);
        System.out.printf("arrayList.size()=%d\n", arrayList.size());

        System.out.println("通过迭代器遍历：");
        Iterator<Integer> it = arrayList.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();

        System.out.println("通过索引值遍历：");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(arrayList.get(i)+" ");
        }
        System.out.println();

        System.out.println("for循环遍历：");
        for (Integer integer : arrayList) {
            System.out.print(integer + " ");
        }
        System.out.println();

        Integer[] array = new Integer[arrayList.size()];
        arrayList.toArray(array);

        System.out.println(Arrays.toString(array));
    }
}
