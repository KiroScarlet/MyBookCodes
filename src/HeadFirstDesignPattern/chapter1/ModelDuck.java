package HeadFirstDesignPattern.chapter1;

/**
 * @author KiroScarlet
 * @date 2019-08-31  -20:35
 * @title ModelDuck
 * @project MyBookCodes
 * @desc TODO
 */
public class ModelDuck extends Duck {
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a model duck");
    }
}
