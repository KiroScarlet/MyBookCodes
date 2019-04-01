package CoreJava.CoreJava1.Chapter6;

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
}
