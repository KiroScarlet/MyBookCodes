package JavaGuide.javacollection;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * @author KiroScarlet
 * @date 2019-07-28  -17:26
 * @title ComparableAndComparator
 * @project MyBookCodes
 * @desc Comparable和Comparator的比较
 */
public class ComparableAndComparator {
    @Test
    public void test() {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(-1);
        arrayList.add(3);
        arrayList.add(3);
        arrayList.add(-5);
        arrayList.add(7);
        arrayList.add(4);
        arrayList.add(-9);
        arrayList.add(-7);
        System.out.println(arrayList);

        Collections.reverse(arrayList);
        System.out.println("数组翻转：" + arrayList);

        Collections.sort(arrayList);
        System.out.println("升序排列" + arrayList);

        //定制排序的用法
        Collections.sort(arrayList, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });

        System.out.println("定制排序后：" + arrayList);
    }
}
