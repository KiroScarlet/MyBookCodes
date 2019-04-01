package HeadFirstJava.Chapter6;


import java.util.ArrayList;

/**
 * @author KiroScarlet
 * @date 2019-03-11  -17:17
 */
public class DotComBust {

    private GameHelper helper = new GameHelper();
    private ArrayList<DotCom> dotComsList = new ArrayList<>();
    private int numOfGuesses = 0;

    public static void main(String[] args) {
        DotComBust game = new DotComBust();
        game.setUpGame();
        game.startPlaying();
    }

    private void startPlaying() {
        while (!dotComsList.isEmpty()) {
            String userGuess = helper.getUserInput("Enter a guess");
            checkUserGuess(userGuess);
        }

        finishGame();
    }

    private void finishGame() {
        System.out.println(numOfGuesses);
    }

    private void checkUserGuess(String userGuess) {
        numOfGuesses++;
        String result = "miss";
        for (DotCom dotComToTest : dotComsList) {
            result = dotComToTest.checkYourself(userGuess);
            if (result.equals("hit")) {
                break;
            }
            if (result.equals("kill")) {
                dotComsList.remove(dotComToTest);
                break;
            }
        }

        System.out.println(result);
    }

    private void setUpGame() {

        DotCom one = new DotCom();
        one.setName("Pets.com");
        DotCom two = new DotCom();
        two.setName("eToys.com");
        DotCom three = new DotCom();
        three.setName("Go2.com");

        dotComsList.add(one);
        dotComsList.add(two);
        dotComsList.add(three);

        for (DotCom dotComToSet : dotComsList) {
            ArrayList<String> newLocation = helper.placeDotCom(3);
            dotComToSet.setLocationCells(newLocation);
        }
    }
}
