package CoreJava.CoreJava1.Chapter5;

import CoreJava.CoreJava1.Chapter4.Employee;

import java.lang.reflect.Field;

/**
 * @author KiroScarlet
 * @date 2019-03-02  -15:11
 */
public class ReflectionTest {

    public static void main(String[] args) {

        Employee harry = new Employee("harry port", 4000, 1993, 12, 12);
        Class cl = harry.getClass();
        try {
            Field f = cl.getDeclaredField("name");
            f.setAccessible(true);

            Object v = f.get(harry);
            System.out.println(v.toString());
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

    }
}
