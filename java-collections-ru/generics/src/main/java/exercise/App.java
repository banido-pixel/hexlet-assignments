package exercise;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.Map.Entry;
import java.util.stream.Collectors;

// BEGIN
public class App {

    public static List<Map<String, String>> findWhere(List<Map<String, String>> books, Map<String, String> where) {
        List<Map<String, String>> result = new ArrayList<>(books);
        for (Map.Entry<String, String> e : where.entrySet()) {
            result = result.stream()
                    .filter(b -> b.containsKey(e.getKey()) && b.get(e.getKey()).equals(e.getValue()))
                    .collect(Collectors.toList());
        }
        return result;
    }
    
}
//END
