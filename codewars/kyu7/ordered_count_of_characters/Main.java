package kyu7.ordered_count_of_characters;

/*
    Task: Ordered Count of Characters (7 kyu)
    URL: https://www.codewars.com/kata/57a6633153ba33189e000074

    Description: Count the number of occurrences of each character and return it as a (list of tuples) in order of
    appearance. For empty output return (an empty list). Consult the solution set-up for the exact data structure
    implementation depending on your language.

    ordered_count("abracadabra") == [('a', 5), ('b', 2), ('r', 2), ('c', 1), ('d', 1)]
*/

import java.util.List;
import java.util.Map;
import java.util.LinkedHashMap;
import java.util.ArrayList;
import org.apache.commons.lang3.tuple.Pair;

public class Main {
    public static List<Pair<Character, Integer>> orderedCount(String text) {
        char[] chars = text.toCharArray();
        Map<Character, Integer> charToCount = new LinkedHashMap<>();
        for (Character i : chars) {
            if (charToCount.containsKey(i)) {
                charToCount.put(i, charToCount.get(i) + 1);
            } else {
                charToCount.put(i, 1);
            }
        }
        List<Pair<Character, Integer>> result = new ArrayList<>();
        for (Map.Entry<Character, Integer> entry : charToCount.entrySet()) {
            char key = entry.getKey();
            int value = entry.getValue();
            Pair<Character, Integer> pair = Pair.of(key, value);
            result.add(pair);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(orderedCount("abracadabra"));
    }
}
