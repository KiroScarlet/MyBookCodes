package JavaGuide.javaconcurrent;

/**
 * @author KiroScarlet
 * @date 2019-08-01  -17:44
 * @title Singleton
 * @project MyBookCodes
 * @desc 双重锁校验实现单例模式
 */
public class Singleton {
    private volatile static Singleton uniqueInstance;

    private Singleton() {

    }

    public static Singleton getUniqueInstance() {
        if (uniqueInstance == null) {
            synchronized (Singleton.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new Singleton();
                }
            }
        }

        return uniqueInstance;
    }
}
