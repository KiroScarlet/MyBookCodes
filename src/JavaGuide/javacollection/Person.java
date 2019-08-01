package JavaGuide.javacollection;

import org.junit.Test;

import java.util.Set;
import java.util.TreeMap;

/**
 * @author KiroScarlet
 * @date 2019-07-28  -17:32
 * @title Person
 * @project MyBookCodes
 * @desc TODO
 */
public class Person implements Comparable<Person> {

    private String name;
    private int age;

    public Person(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    /**
      * @Author KiroScarlet
      * @Description 重写compareTo方法
      * @Date 2019-07-28 -17:34
      * @param o: 要比较的对象
      * @return int
      **/
    public int compareTo(Person o) {
        if (this.age > o.getAge()) {
            return 1;
        } else if (this.age < o.getAge()) {
            return -1;
        }
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


}
