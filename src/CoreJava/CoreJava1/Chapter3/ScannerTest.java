package CoreJava.CoreJava1.Chapter3;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 * @author KiroScarlet
 * @date 2019-04-29  -17:15
 */
public class ScannerTest {
    public static void main(String[] args) {
        try {

            PrintWriter out = new PrintWriter("test.txt", "UTF-8");
            out.print(123456);
            out.close();
            Scanner in = new Scanner(Paths.get("test.txt"), "UTF-8");
            System.out.println(in.nextInt());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
