package CoreJava.CoreJava1.Chapter8;

import java.time.LocalDate;

/**
 * @author KiroScarlet
 * @date 2019-03-05  -16:19
 */
public class PairTest1 {

    public static void main(String[] args) {
        String[] word = {"mary", "has", "a", "lattle", "lamb"};
        Pair<String> nm = ArrayAlg.minmax(word);
        System.out.println(nm.getFirst()+"\n"+nm.getSecond());

        LocalDate[] birthdays = {LocalDate.of(1960, 12, 12), LocalDate.of(1942, 12, 12)};
        Pair<LocalDate> mm = ArrayAlg.minmax(birthdays);


        System.out.println(mm.getFirst()+"\n"+mm.getSecond());

    }
}

class ArrayAlg {

    public static <T extends Comparable> Pair<T> minmax(T[] a) {
        if (a == null || a.length == 0) {
            return null;
        }
        T min = a[0];
        T max = a[0];

        for (int i = 1; i < a.length; i++) {
            if (min.compareTo(a[i])>0) min = a[i];
            if (max.compareTo(a[i])<0) max = a[i];
        }

        return new Pair<>(min, max);
    }
}
