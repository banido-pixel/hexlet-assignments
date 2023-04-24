package exercise;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class App {

    public static boolean scrabble(String chars, String finalWord) {
        List<Character> charList = new ArrayList<>(chars.chars()
                .mapToObj(e -> (char) e)
                .map(Character::toLowerCase)
                .toList());

        for (int i = 0; i < finalWord.length(); i++) {
            if (charList.contains(Character.toLowerCase(finalWord.charAt(i)))) {
                charList.remove(Character.valueOf(Character.toLowerCase(finalWord.charAt(i))));
            } else {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {

    }
}