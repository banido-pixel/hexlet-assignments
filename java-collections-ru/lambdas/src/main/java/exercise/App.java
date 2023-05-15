package exercise;

import java.util.Arrays;
import java.util.stream.Stream;

// BEGIN
public class App {
    public static String[][] enlargeArrayImage(String[][] image) {
        return Arrays.stream(image)
                .map(s -> Arrays.stream(s)
                        .flatMap(str -> Stream.of(str, str))
                        .toArray(String[]::new))
                .toArray(String[][]::new);
    }
}
// END
