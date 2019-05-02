package CoreJava.CoreJava1.Chapter6;

import java.util.Arrays;
import java.util.Date;
import javax.swing.*;

/**
 * @author KiroScarlet
 * @date 2019-03-03  -15:39
 */
public class LamdaTest {
    public static void main(String[] args) {
        String[] planets = new String[]{"mecrer", "asdfsdafaa", "asdfsdfaaaa", "gggggg"};
        System.out.println(Arrays.toString(planets));
        Arrays.sort(planets);

        System.out.println(Arrays.toString(planets));

        Arrays.sort(planets, (first, second) -> first.length() - second.length());
        System.out.println(Arrays.toString(planets));

        Arrays.sort(planets, String::compareToIgnoreCase);
        System.out.println(Arrays.toString(planets));

/*        Timer t = new Timer(1000, event -> System.out.println("time is" + new Date()));
        t.start();

        JOptionPane.showMessageDialog(null, "quit programs?");
        System.exit(0);*/
    }
}
