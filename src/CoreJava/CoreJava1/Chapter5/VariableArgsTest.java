package CoreJava.CoreJava1.Chapter5;

/**
 * @author KiroScarlet
 * @date 2019-05-02  -16:52
 */
public class VariableArgsTest {
    public static double max(double... values) {
        double largest = Double.NEGATIVE_INFINITY;
        for (double value : values) {
            if (value > largest) {
                largest = value;
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        System.out.println(VariableArgsTest.max(1.1,3434.34,-234,333,3332));
    }

}
