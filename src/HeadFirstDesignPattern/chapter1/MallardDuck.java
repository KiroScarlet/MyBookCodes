package HeadFirstDesignPattern.chapter1;

/**
 * @author KiroScarlet
 * @date 2019-08-31  -20:20
 * @title MallardDuck
 * @project MyBookCodes
 * @desc TODO
 */
public class MallardDuck extends Duck {
    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I'm a real Mallard duck");
    }
}
