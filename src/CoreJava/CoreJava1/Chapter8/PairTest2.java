package CoreJava.CoreJava1.Chapter8;

import java.time.LocalDate;

/**
 * @author KiroScarlet
 * @date 2019-05-03  -14:24
 */
public class PairTest2 {
    public static void main(String[] args) {
        LocalDate[] birthdays = {
                LocalDate.of(1993,12,12),
                LocalDate.of(1922,12,12),
                LocalDate.of(1222,12,12),
                LocalDate.of(1993,11,12),
        };

        Pair<LocalDate> minmax = ArrayAlg2.minmax(birthdays);
        System.out.println(minmax.getFirst()+" "+minmax.getSecond());
    }
}



class ArrayAlg2 {
    public static <T extends Comparable> Pair<T> minmax(T[] a) {
        if (a == null || a.length == 0) {
            return null;
        }
        T min = a[0];
        T max = a[0];
        for (int i = 0; i < a.length; i++) {
            if (min.compareTo(a[i]) > 0) {
                min = a[i];
            }
            if (max.compareTo(a[i]) < 0) {
                max = a[i];
            }
        }
        return new Pair<>(min, max);
    }
}
