package CoreJava.CoreJava2.Chapter1;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author KiroScarlet
 * @date 2019-03-10  -21:28
 */
public class CreatingStreams {
    public static <T> void show(String title, Stream<T> stream) {
        final int SIZE = 10;
        List<T> fitstElements=stream.limit(SIZE+1).collect(Collectors.toList());
    }
}
