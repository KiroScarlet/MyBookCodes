package CoreJava.CoreJava1.Chapter5;

/**
 * @author KiroScarlet
 * @date 2019-05-02  -16:28
 */
public class EqualsTest {
    public static void main(String[] args) {
        Employee alice1 = new Employee("alice adams", 75000);
        Employee alice2 = alice1;
        Employee alice3 = new Employee("alice adams", 75000);
        Employee bob = new Employee("bob brandson", 5000);

        System.out.println(alice1==alice2);
        System.out.println(alice1==alice3);

        System.out.println(alice1.equals(alice2));
        System.out.println(alice1.equals(alice3));

        System.out.println(alice1.equals(bob));

        System.out.println(bob.toString());

        Manager carl = new Manager("carl cracker", 80000);
        Manager boss = new Manager("carl cracker", 80000);
        boss.setBonus(5000);

        System.out.println(boss.toString());
        System.out.println(carl.equals(boss));

        System.out.println(alice1.hashCode());
        System.out.println(alice3.hashCode());

        System.out.println(bob.hashCode());
        System.out.println(carl.hashCode());

    }
}
