package lesson10;

import java.util.Arrays;
import java.util.HashSet;


public class Main {
    public static void main(String[] args) {
        sentence("масло, масло, колбаса, молоко. milk: milk milk-milk");
    }

    public static void sentence(String sentence) {
        String[] words = sentence.split("[\\s\\.,:-]+");
        HashSet<String> newWord = new HashSet<>(Arrays.asList(words));
        for (String word : newWord) {
            System.out.println(word.substring(0, 1).toUpperCase() + word.substring(1));
        }
    }
}
