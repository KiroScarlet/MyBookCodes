package CoreJava.CoreJava1.Chapter4;

/**
 * @author KiroScarlet
 * @date 2019-02-26  -20:48
 */
public class ManagerTest {
    public static void main(String[] args) {

        Employee e = new Manager("lisi", 5000,1993, 12, 12);

        System.out.println(e.getClass().getName()+" "+e.getName());

        String className = "Employee";
        try {
            Class cl = Class.forName(className);
            System.out.println(cl.getClass().getName()+" "+cl.getName());
        } catch (ClassNotFoundException e1) {
            e1.printStackTrace();
        }
    }

}