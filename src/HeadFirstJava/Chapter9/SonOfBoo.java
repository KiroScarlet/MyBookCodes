package HeadFirstJava.Chapter9;

/**
 * @author KiroScarlet
 * @date 2019-03-11  -19:42
 */
public class SonOfBoo extends Boo {
    public SonOfBoo(){
        super("boo");
    }
    public SonOfBoo(int i) {
        super("fred");
    }

    public SonOfBoo(String s) {
        super(42);
    }

    public SonOfBoo(String s, int i) {
        super(s, i);
    }
}
