package JavaConcurrent.Chapter5;

/**
 * @author KiroScarlet
 * @date 2019-06-11  -9:20
 */
public class StaticSingleton {
    private StaticSingleton() {
        System.out.println("staticSingleton is created!");
    }

    private static class singletonHolder {
        private static StaticSingleton instance = new StaticSingleton();
    }

    public static StaticSingleton getInstance() {
        return singletonHolder.instance;
    }
}
