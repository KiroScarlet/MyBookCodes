package HeadFirstDesignPattern.chapter1;

/**
 * @author KiroScarlet
 * @date 2019-08-31  -20:20
 * @title MiniDuckSimulator
 * @project MyBookCodes
 * @desc TODO
 */
public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();
        mallard.display();
        mallard.swim();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowerd());
        model.performFly();
    }
}
