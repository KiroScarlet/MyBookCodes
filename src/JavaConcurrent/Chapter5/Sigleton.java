package JavaConcurrent.Chapter5;

/**
 * @author KiroScarlet
 * @date 2019-06-11  -9:11
 */
public class Sigleton {
    private static int STATUS = 1;
    private Sigleton() {
        System.out.println("Sigleton is created!");
    }

    private static Sigleton instance = new Sigleton();

    public static Sigleton getInstance() {
        return instance;
    }
}
