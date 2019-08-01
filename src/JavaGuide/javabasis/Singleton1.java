package JavaGuide.javabasis;

/**
 * @author KiroScarlet
 * @date 2019-07-22  -21:50
 * @desc 静态内部类实现单例模式
 */
public class Singleton1 {

    //声明为 private 避免调用默认构造方法创建对象
    private Singleton1() {
    }

    //声明为 private 表明静态内部该类只能在该 Singleton 类中被访问
    private static class SingletonHolder {
        private static final Singleton1 INSTANCE = new Singleton1();
    }

    
    public static Singleton1 getUniqueInstance() {
        return SingletonHolder.INSTANCE;
    }
}
