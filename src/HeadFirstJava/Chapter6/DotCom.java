package HeadFirstJava.Chapter6;

import java.util.ArrayList;

/**
 * @author KiroScarlet
 * @date 2019-03-11  -15:49
 */
public class DotCom {

    private ArrayList<String> locationCells;
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public void setLocationCells(ArrayList<String> locationCells) {
        this.locationCells = locationCells;
    }


    public String checkYourself(String userInput) {

        String result = "miss";
        int index = locationCells.indexOf(userInput);
        if (index >= 0) {
            locationCells.remove(index);

            if (locationCells.isEmpty()) {
                result = "kill";
            } else {
                result = "hit";
            }
        }
        return result;
    }
}
