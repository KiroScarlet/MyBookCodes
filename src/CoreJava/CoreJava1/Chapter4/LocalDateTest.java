package CoreJava.CoreJava1.Chapter4;

import java.time.LocalDate;

/**
 * @author KiroScarlet
 * @date 2019-04-29  -17:39
 */
public class LocalDateTest {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        System.out.println(now);
        LocalDate myBirthDay = LocalDate.of(1993, 12, 12);
        System.out.println(myBirthDay);

        LocalDate date = myBirthDay.plusDays(1000);
        System.out.println(date.getYear());
    }
}
