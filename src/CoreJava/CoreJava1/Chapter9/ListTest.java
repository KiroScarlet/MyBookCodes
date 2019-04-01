package CoreJava.CoreJava1.Chapter9;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * @author KiroScarlet
 * @date 2019-03-05  -20:31
 */
public class ListTest {
    public static void main(String[] args) {
        List<String> staff = new LinkedList<>();

        staff.add("amy");
        staff.add("bob");
        staff.add("calr");
        Iterator iter = staff.iterator();
        String first = (String) iter.next();
        String second = (String) iter.next();
        iter.remove();

    }
}
