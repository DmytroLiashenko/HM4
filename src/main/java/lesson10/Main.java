package lesson10;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        String sentence = "масло, масло, колбаса, молоко. milk: milk milk-milk";
        String[] words = sentence.split("[\\s\\.,:-]+");

        Set<String> newWord = new HashSet<>(Arrays.asList(words));

        for (String word : newWord) {
            System.out.println(word.substring(0, 1).toUpperCase() + word.substring(1));
        }
    }
}
