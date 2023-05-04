package exercise;

import java.util.List;
import java.util.Arrays;

// BEGIN
public class App {

    public static long getCountOfFreeEmails(List<String> emails) {
        return emails.stream()
                .filter(e -> e.endsWith("gmail.com") || e.endsWith("yandex.ru") || e.endsWith("hotmail.com"))
                .count();
    }
    
}
// END
