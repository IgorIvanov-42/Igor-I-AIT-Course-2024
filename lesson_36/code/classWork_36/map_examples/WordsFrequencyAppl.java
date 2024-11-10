package classWork_36.map_examples;

import java.util.HashMap;
import java.util.Map;

public class WordsFrequencyAppl {
    public static void main(String[] args) {

        String[] words = {"a", "abc", "ab", "limit", "ab", "a", "ab", "limit", "a", "a", "a"};

        printWordFrequency(words);
    }

    private static void printWordFrequency(String[] words){
        Map<String, Integer> resultMap = new HashMap<>();

        for (String word : words) {
            if (!resultMap.containsKey(word)){
                resultMap.put(word, 1);
            } else {
                resultMap.put(word, resultMap.get(word) + 1);
            }

        }

        for (String word : resultMap.keySet()) {
            System.out.println("Word: " + word + ", frequency: " + resultMap.get(word));
        }
    }
}// end of class
