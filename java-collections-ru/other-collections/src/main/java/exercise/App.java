package exercise;

import java.util.*;

// BEGIN
public class App {
    
    public static LinkedHashMap<String, String> genDiff(Map<String, Object> first, Map<String, Object> second) {
        LinkedHashMap<String, String> result = new LinkedHashMap<>();
        first.keySet().forEach(e -> result.put(e, "deleted"));
        second.keySet().forEach(e -> {
            if (first.get(e) == null) {
                result.put(e, "added");
            } else if (first.get(e).equals(second.get(e))) {
                result.put(e, "unchanged");
            } else {
                result.put(e, "changed");
            }
        });
        return result;
    }

    public static void main(String[] args) {
        Map<String, Object> data1 = new HashMap<>(
                Map.of("one", "eon", "two", "two", "four", true)
        );

        Map<String, Object> data2 = new HashMap<>(
                Map.of("two", "own", "zero", 4, "four", true)
        );

        Map<String, String> result = App.genDiff(data1, data2);
        System.out.println(result);
    }
}
//END
