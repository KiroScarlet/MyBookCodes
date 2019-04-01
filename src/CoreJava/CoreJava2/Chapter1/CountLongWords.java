package CoreJava.CoreJava2.Chapter1;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

/**
 * @author KiroScarlet
 * @date 2019-03-10  -21:32
 */
public class CountLongWords {
    public static void main(String[] args) throws IOException {
        String contents = new String(Files.readAllBytes(Paths.get("D:\\corejava\\v2ch01\\cities.txt")), StandardCharsets.UTF_8);
        List<String> words = Arrays.asList(contents.split("\\PL+"));

        long count = 0;
        for (String w : words) {
            if (w.length()>8) count++;
        }
        System.out.println(count);

        count = words.stream().filter(w -> w.length() > 8).count();
        System.out.println(count);

        count = words.parallelStream().filter(w -> w.length() > 8).count();
        System.out.println(count);
    }
}
