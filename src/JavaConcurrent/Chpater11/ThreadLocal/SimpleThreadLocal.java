package JavaConcurrent.Chpater11.ThreadLocal;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * @author KiroScarlet
 * @date 2019-06-11  -14:43
 * ThreadLocal的实现思路的一个简单实现
 */
public class SimpleThreadLocal {
    private Map valueMap = Collections.synchronizedMap(new HashMap<>());

    public void set(Object newValue) {
    }
}
