package CoreJava.CoreJava1.Chapter6;

import CoreJava.CoreJava1.Chapter4.Employee;

import java.util.Arrays;


/**
 * @author KiroScarlet
 * @date 2019-03-02  -21:46
 */
public class EmployeeSortTest {
    public static void main(String[] args) {
        Employee[] staff = new Employee[3];
        staff[0] = new Employee("a", 332223);
        staff[1] = new Employee("b", 444);
        staff[2] = new Employee("c", 555);
        Arrays.sort(staff);
        for (Employee e : staff) {
            System.out.println(e.toString());
        }
    }
}
