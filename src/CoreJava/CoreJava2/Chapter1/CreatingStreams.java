package CoreJava.CoreJava2.Chapter1;

import java.io.IOException;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author KiroScarlet
 * @date 2019-03-10  -21:28
 */
public class CreatingStreams {
    public static <T> void show(String title, Stream<T> stream) {
        final int SIZE = 10;
        List<T> firstElements = stream.limit(SIZE + 1).collect(Collectors.toList());
        System.out.print(title + ": ");
        for (int i = 0; i < firstElements.size(); i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            if (i < SIZE) {
                System.out.print(firstElements.get(i));
            }else System.out.print("...");
        }
        System.out.println();
    }

    public static void main(String[] args) throws IOException {
        String path = "D:\\IdeaProject\\corejava\\v2ch01\\cities.txt";
        String contents = new String(Files.readAllBytes(Paths.get(path)), StandardCharsets.UTF_8);

        Stream<String> words = Stream.of(contents.split("\\PL+"));
        show("words",words);

        Stream<String> songs = Stream.of("gentlu","down","the","stream");
        show("songs",songs);

        Stream<String> silence = Stream.empty();
        show("silence",silence);

        Stream<String> echos = Stream.generate(() -> "echo");
        show("echos", echos);

        Stream<Double> randoms = Stream.generate(Math::random);
        show("randoms",randoms);

        Stream<BigInteger> integers = Stream.iterate(BigInteger.ONE, n -> n.add(BigInteger.ONE));
        show("integers",integers);

        //流排序
        Stream<String> words2 = Stream.of("gentlu", "down", "the", "stream");
        Stream<String> longestFirst = words2.sorted(Comparator.comparing(String::length).reversed());
        show("longestFirst",longestFirst);

        Object[] powers = Stream.iterate(1.0, p -> p * 2)
                .peek(e -> System.out.println("Fetching " + e))
                .limit(20).toArray();

        //获得最大值
        Stream<String> words3 = Stream.of("gentlu", "down", "the", "stream");
        Optional<String> largest = words3.max(String::compareToIgnoreCase);
        System.out.println("largest: "+largest.orElse(""));




    }
}
