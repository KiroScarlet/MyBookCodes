package HeadFirstJava.Chapter2;

/**
 * @author KiroScarlet
 * @date 2019-03-11  -14:07
 */
public class Player {

    int number = 0;
    public void guess() {
        number = (int) (Math.random() * 10);
        System.out.println("I'm guessing " + number);
    }
}


