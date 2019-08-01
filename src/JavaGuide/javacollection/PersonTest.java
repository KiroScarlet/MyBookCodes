package JavaGuide.javacollection;

import org.junit.Test;

import java.util.Set;
import java.util.TreeMap;

/**
 * @author KiroScarlet
 * @date 2019-07-28  -17:41
 * @title PersonTest
 * @project MyBookCodes
 * @desc TODO
 */
public class PersonTest {

    /**
     * @Author KiroScarlet
     * @Description TODO
     * @Date 2019-07-28 -17:36
     * @return void
     **/
    @Test
    public void test() {
        TreeMap<Person, String> pdata = new TreeMap<>();
        pdata.put(new Person("张三", 30), "zhangsan");
        pdata.put(new Person("李四", 20), "lisi");
        pdata.put(new Person("王五", 10), "wangwu");
        pdata.put(new Person("小红", 5), "xiaohong");

        Set<Person> keySet = pdata.keySet();
        for (Person person : keySet) {
            System.out.println(person.toString());
        }
    }
}
