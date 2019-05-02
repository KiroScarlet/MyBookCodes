package CoreJava.CoreJava1.Chapter6;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author KiroScarlet
 * @date 2019-03-02  -22:08
 */

public class LengthComparator implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        return o1.length() - o2.length();
    }

    public static void main(String[] args) {
        String[] friends = {"peter", "lisa", "tom"};
        Arrays.sort(friends, new LengthComparator());
        System.out.println(Arrays.toString(friends));
    }

}
