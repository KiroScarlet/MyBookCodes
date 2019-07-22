package JavaConcurrent.Chapter5;

/**
 * @author KiroScarlet
 * @date 2019-06-11  -9:15
 */
public class LazySingleton {
    private LazySingleton() {
        System.out.println("lazySingleton is cerated!");
    }

    private static LazySingleton instance = null;
    public static synchronized LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }

}
