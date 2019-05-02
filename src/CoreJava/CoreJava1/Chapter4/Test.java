package CoreJava.CoreJava1.Chapter4;

/**
 * @author KiroScarlet
 * @date 2019-02-25  -15:41
 */
public class Test {
    public static void main(String[] args){

        Employee1 employee1 = new Employee1();
        System.out.println(employee1.getName());

        Employee2 employee2a = new Employee2();
        System.out.println(employee2a.getId());
        Employee2 employee2b = new Employee2();
        System.out.println(employee2b.getId());
        Employee2 employee2c = new Employee2();
        System.out.println(employee2c.getId());
    }

}

class Employee1 {
    private String name = "li";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Employee2 {
    private static int nextId;
    private int id = assignId();

    private int assignId() {
        int n = nextId;
        nextId++;
        return n;
    }

    public static int getNextId() {
        return nextId;
    }

    public static void setNextId(int nextId) {
        Employee2.nextId = nextId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

class Employee3 {
    private String name;
    private double salary;

    public Employee3(double salary) {
        this("aEmployee", salary);
    }

    public Employee3(String name, double salary) {
        this.salary = salary;
        this.name = name;
    }
}


