package exercise;

import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;

public class App {

    public static Map<String, Integer> getWordCount(String text) {
        Map<String, Integer> words = new HashMap<>();
        if (text.isBlank()) return words;
        Arrays.stream(text.split(" "))
                .forEach(w -> words.merge(w, 1, (n1, n2) -> n1 + 1));
        return words;
    }

    public static String toString(Map<String, Integer> words) {
        if (words.isEmpty()) {
            return "{}";
        }
        StringBuilder builder = new StringBuilder("{\n");
        words.forEach((key, value) -> builder.append("  ")
                .append(key)
                .append(": ")
                .append(value)
                .append("\n"));
        builder.append("}");
        return builder.toString();
    }
    
}
