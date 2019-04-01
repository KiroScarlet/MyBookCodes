package HeadFirstJava.Chpater5;

/**
 * @author KiroScarlet
 * @date 2019-03-11  -15:11
 */
public class SimpleDotComGame {
    public static void main(String[] args) {
        SimpleDotCom dotCom = new SimpleDotCom();

        GameHelper helper = new GameHelper();
        int numberOfOne = (int) (Math.random() * 5);

        int[] loca = {numberOfOne, numberOfOne + 1, numberOfOne + 2};

        dotCom.setLocationCells(loca);

        String result = "miss";
        while (result != "kill") {
            String guess = helper.getUserInput("Please Enter Your Guess:");
            result = dotCom.CheckYourself(guess);
        }
    }
}
