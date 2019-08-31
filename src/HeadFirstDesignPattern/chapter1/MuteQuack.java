package HeadFirstDesignPattern.chapter1;

/**
 * @author KiroScarlet
 * @date 2019-08-31  -20:17
 * @title MuteQuack
 * @project MyBookCodes
 * @desc TODO
 */
public class MuteQuack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("<< Silence >>");
    }
}
