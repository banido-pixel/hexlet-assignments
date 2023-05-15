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
                .flatMap(arr -> Stream.of(arr, arr))
                .toArray(String[][]::new);
    }
}
// END
