package kyu6.count_characters_in_your_string;

/*
    Task: Count characters in your string (6 kyu)
    URL: https://www.codewars.com/kata/52efefcbcdf57161d4000091

    Description: The main idea is to count all the occurring characters in a string. If you have a string like aba, then
    the result should be {'a': 2, 'b': 1}. What if the string is empty? Then the result should be empty object literal,
    {}.

    Input: "aaaaabbb"
    Output: {a=5, b=3}

    Input: "aabbbac"
    Output: {a=3, b=3, c=1}
*/

import java.util.HashMap;
import java.util.Map;

import static java.util.stream.Collectors.toMap;
import static org.junit.Assert.assertEquals;

public class Main {
    public static void main(String[] args) {
        System.out.println(count("aaaaabbb"));
        System.out.println(count("aabbbac"));
        testEmptyString();
        testSingleCharacter();
        testMultipleCharacters();
    }

    public static void testEmptyString() {
        Map<Character, Integer> d = new HashMap<>();
        assertEquals(d, Main.count(""));
    }

    public static void testSingleCharacter() {
        Map<Character, Integer> d = new HashMap<>();
        d.put('a', 1);
        assertEquals(d, Main.count("a"));
    }

    public static void testMultipleCharacters() {
        Map<Character, Integer> d = new HashMap<>();
        d.put('a', 3);
        d.put('b', 3);
        d.put('c', 1);
        assertEquals(d, Main.count("aabbbac"));
    }

    public static Map<Character, Integer> count(String str) {
//        Map<Character, Integer> symbolToQuantity = new HashMap<>();
//        for (int i = 0; i < str.length(); i++) {
//            if (symbolToQuantity.containsKey(str.charAt(i))) {
//                symbolToQuantity.put(str.charAt(i), symbolToQuantity.get(str.charAt(i)) + 1);
//            } else {
//                symbolToQuantity.put(str.charAt(i), 1);
//            }
//        }
//        return symbolToQuantity;
        
        return str.chars().mapToObj(c -> (char) c).collect(toMap(c -> c, c -> 1, Integer::sum));
    }
}
