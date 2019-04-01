package HeadFirstJava.Chapter16;

import java.util.HashMap;

/**
 * @author KiroScarlet
 * @date 2019-03-12  -14:31
 */
public class MapTest {
    public static void main(String[] args) {
        HashMap<String, Integer> scores = new HashMap<>();
        scores.put("sdf", 43);
        scores.put("sdfsss", 121);
        System.out.println(scores);

        System.out.println(scores.get("sdf"));
    }
}
