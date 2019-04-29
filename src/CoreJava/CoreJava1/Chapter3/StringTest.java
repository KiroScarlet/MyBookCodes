package CoreJava.CoreJava1.Chapter3;

/**
 * @author KiroScarlet
 * @date 2019-04-29  -15:40
 */
public class StringTest {
    public static void main(String[] args) {
        String greeting = "hello";
        String s = greeting.substring(0, 3);
        System.out.println(s);

        //+号拼接字符串
        String expletive = "expletive";
        String PG13 = "deleted";
        String message = expletive + PG13;
        System.out.println(message);

        //将多个字符串放在一起，用一个定界符分隔，使用join方法
        String all = String.join("/", "s", "m", "l");
        System.out.println(all);

        int compareResult = expletive.compareTo(PG13);
        System.out.println(compareResult);

        System.out.println(expletive.equals(PG13));
        System.out.println(expletive.equals("expletive"));
        System.out.println(expletive.equalsIgnoreCase("Expletive"));

        System.out.println(expletive.indexOf("ple"));

        System.out.println("   sdf   sd  ".trim());
    }
}
