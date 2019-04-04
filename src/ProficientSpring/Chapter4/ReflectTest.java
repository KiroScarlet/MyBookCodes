package ProficientSpring.Chapter4;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * @author KiroScarlet
 * @date 2019-04-04  -9:58
 */
public class ReflectTest {
    public static Car initByDefaultConst() throws Throwable {

        //通过类装载器获得Car类对象
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        Class clazz = loader.loadClass("ProficientSpring.Chapter4.Car");
        //注意：装载类时要写全限定类名

        //获取类的默认构造器对象并通过它实例化Car
        //(1)无参构造方法
        Constructor cons= clazz.getDeclaredConstructor();
        Car car = (Car) cons.newInstance();

        /*
        //(2)有参构造方法
        Constructor cons= clazz.getDeclaredConstructor(String.class,String.class,int.class);
        Car car = (Car) cons.newInstance("123","123",123);
        */

        //通过反射方法设置属性
        Method setBrand = clazz.getMethod("setBrand", String.class);
        setBrand.invoke(car, "红旗CA73");

        Method setColor = clazz.getMethod("setColor", String.class);
        setColor.invoke(car, "黑色");

        Method setMaxSpeed = clazz.getMethod("setMaxSpeed", int.class);
        setMaxSpeed.invoke(car, 200);

        return car;
    }

    public static void main(String[] args) throws Throwable {
        Car car=initByDefaultConst();
        car.introduce();
    }
}
