package test;

import java.util.Calendar;

/**
 * @author KiroScarlet
 * @date 2019-06-24  -11:21
 */
public class DateTest {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.MONTH,3);
        System.out.println(calendar.getTime());
    }
}
