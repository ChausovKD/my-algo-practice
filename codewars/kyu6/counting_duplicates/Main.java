package kyu6.counting_duplicates;

/*
    Task: Counting Duplicates (6 kyu)
    URL: https://www.codewars.com/kata/54bf1c2cd5b56cc47f0007a1

    Description: Write a function that will return the count of distinct case-insensitive alphabetic characters and
    numeric digits that occur more than once in the input string. The input string can be assumed to contain only
    alphabets (both uppercase and lowercase) and numeric digits.

    Input: "abcde"
    Output: 0
    Explanation: no characters repeats more than once

    Input: "aabbcde"
    Output: 2
    Explanation: 'a' and 'b'

    Input: "ABBA"
    Output: 2
    Explanation: 'A' and 'B' each occur twice

    Input: "aA11"
    Output: 2
    Explanation: 'a' and '1' each occur twice
*/

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        System.out.println(duplicateCount("aaaabcde"));
        System.out.println(duplicateCount("abcdea"));
        System.out.println(duplicateCount("indivisibility"));
        System.out.println(duplicateCount("aA11"));
        System.out.println(duplicateCount("ABBA"));
    }

    public static int duplicateCount(String text) {
        text = text.toLowerCase();
        Map<Character, Integer> charCount  = new HashMap<>();
        for (char ch : text.toCharArray()) {
            if (Character.isLetterOrDigit(ch)) {
                charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);
            }
        }
        int counterDuplicates = 0;
        for (int count : charCount.values()) {
            if (count > 1) {
                counterDuplicates++;
            }
        }
        return counterDuplicates;
    }
}
