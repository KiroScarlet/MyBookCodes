package HeadFirstJava.Chpater5;

/**
 * @author KiroScarlet
 * @date 2019-03-11  -15:03
 */
public class SimpleDotComTestDrive {
    public static void main(String[] args) {
        SimpleDotCom dot = new SimpleDotCom();
        int[] locations = {2, 3, 4};
        dot.setLocationCells(locations);
        String userGuess = "2";
        String result = dot.CheckYourself(userGuess);
    }
}
