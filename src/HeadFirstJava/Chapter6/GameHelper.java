package HeadFirstJava.Chapter6;

import com.sun.deploy.panel.ITreeNode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * @author KiroScarlet
 * @date 2019-03-11  -17:20
 */
public class GameHelper {
    public String getUserInput(String prompt) {
        String inputLine = null;
        System.out.println(prompt);

        try {
            BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
            inputLine = is.readLine();
            if (inputLine.length() == 0) {
                return null;
            }
        } catch (IOException e) {
            System.out.println(e);
        }

        return inputLine.toLowerCase();
    }

    public ArrayList<String> placeDotCom(int comSize) {

        ArrayList<String> alphaCells = new ArrayList<>();
        String[] alphacoords = new String[comSize];
        String temp = null;
        int[] coords = new int[comSize];
        int attempts = 0;
        boolean success = false;
        int location = 0;

        return alphaCells;
    }
}
