package CoreJava.CoreJava1.Chapter9;

import CoreJava.CoreJava1.Chapter4.Employee;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author KiroScarlet
 * @date 2019-03-05  -22:43
 */
public class MapTest {
    public static void main(String[] args) {
        Map<String, Employee> staff = new HashMap<>();
        staff.put("144-25-544", new Employee("Amy Lee"));
        staff.put("144-25-541", new Employee("Amy Lee2"));
        staff.put("144-25-5444", new Employee("Amy Lee3"));

        System.out.println(staff);
        staff.remove("144-25-544");
//        System.out.println(staff);

        staff.put("144-25-541", new Employee("Frank"));
//        System.out.println(staff);

        staff.forEach((k, v) -> System.out.println(k + " " + v));

        Set<String> keys = staff.keySet();
        for (String key : keys) {
            System.out.println(key);
        }

        Collection<Employee> values = staff.values();
        for (Employee value : values) {
            System.out.println(value);
        }

        for (Map.Entry<String, Employee> entry : staff.entrySet()) {
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
        //和上面效果一样
        staff.forEach((S,E)-> System.out.println(S+":"+E));
    }
}
