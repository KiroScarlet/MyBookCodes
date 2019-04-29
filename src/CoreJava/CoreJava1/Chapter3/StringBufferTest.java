package CoreJava.CoreJava1.Chapter3;

/**
 * @author KiroScarlet
 * @date 2019-04-29  -17:08
 */
public class StringBufferTest {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("i");
        stringBuffer.append(" am");
        stringBuffer.insert(2, "iiiiii");
        System.out.println(stringBuffer.toString());
    }
}
