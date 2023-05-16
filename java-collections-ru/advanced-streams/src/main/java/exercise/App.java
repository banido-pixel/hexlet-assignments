package exercise;

import java.util.stream.Collectors;
import java.util.Arrays;

// BEGIN
public class App {
    
    public static String getForwardedVariables(String text) {
        return Arrays.stream(text.split("\n"))
                .filter(s -> s.startsWith("environment"))
                .map(s -> s.substring(s.indexOf('"') + 1, s.length() - 1))
                .flatMap(s -> Arrays.stream(s.split(",")))
                .filter(s -> s.startsWith("X_FORWARDED"))
                .map(s -> s.replaceAll("X_FORWARDED_", ""))
                .collect(Collectors.joining(","));
    }
}
//END
