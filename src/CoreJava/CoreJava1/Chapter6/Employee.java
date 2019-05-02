package CoreJava.CoreJava1.Chapter6;

import java.util.Date;

/**
 * @author KiroScarlet
 * @date 2019-05-02  -21:16
 */
public class Employee implements Cloneable {
    private String name;
    private Date hireday;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Employee cloned = (Employee) super.clone();
        cloned.hireday = (Date) hireday.clone();

        return cloned;
    }
}
