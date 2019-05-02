package CoreJava.CoreJava1.Chapter5;

import java.util.Objects;

/**
 * @author KiroScarlet
 * @date 2019-05-02  -16:23
 */
public class Manager extends Employee{
    private double bonus;

    public Manager(String name, double salary) {
        super(name, salary);
        bonus = 0;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public double getSalary() {
        return super.getSalary()+bonus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Manager manager = (Manager) o;
        return Double.compare(manager.bonus, bonus) == 0;
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), bonus);
    }

    @Override
    public String toString() {
        return super.toString()+"[bonus="+bonus+"]";
    }
}
