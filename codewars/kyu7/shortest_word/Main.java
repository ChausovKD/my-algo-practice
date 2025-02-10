package kyu7.shortest_word;

/*
    Task: Shortest Word (7 kyu)
    URL: https://www.codewars.com/kata/57cebe1dc6fdc20c57000ac9/java

    Description: Simple, given a string of words, return the length of the shortest word(s). String will never be empty,
    and you do not need to account for different data types.

    Input: "bitcoin take over the world maybe who knows perhaps"
    Output: 3

    Input: "Let's travel abroad shall we"
    Output: 2
*/

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static int findShort(String s) {
        int result = s.length();
        List<String> str = new ArrayList<>(List.of(s.split("\\s+")));
        for (String item : str) {
            if (item.length() < result) {
                result = item.length();
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(findShort("bitcoin take over the world maybe who knows perhaps"));
        System.out.println(findShort("Let's travel abroad shall we"));
    }
}
