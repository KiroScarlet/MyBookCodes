package HeadFirstDesignPattern.chapter1;

/**
 * @author KiroScarlet
 * @date 2019-08-31  -20:14
 * @title FlyNoWay
 * @project MyBookCodes
 * @desc TODO
 */
public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can't fly");
    }
}
