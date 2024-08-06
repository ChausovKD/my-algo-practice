package kyu7.two_to_one;

/*
    Task: Two to One (7 kyu)
    URL: https://www.codewars.com/kata/5656b6906de340bd1b0000ac

    Description: Take 2 strings s1 and s2 including only letters from a to z. Return a new sorted string, the longest
    possible, containing distinct letters - each taken only once - coming from s1 or s2.

    Input: "xyaabbbccccdefww" "xxxxyyyyabklmopq"
    Output: "abcdefklmopqwxy"

    Input: "abcdefghijklmnopqrstuvwxyz" "abcdefghijklmnopqrstuvwxyz"
    Output: "abcdefghijklmnopqrstuvwxyz"
*/

import java.util.Arrays;

public class Main {

    public static String longest (String s1, String s2) {
        String concatStr = s1 + s2;
        char[] chars = concatStr.toCharArray();
        Arrays.sort(chars);
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < chars.length; i++) {
            if (i == 0 || chars[i] != chars[i-1]) {
                stringBuilder.append(chars[i]);
            }
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        System.out.println(longest("aretheyhere", "yestheyarehere"));
        System.out.println(longest("loopingisfunbutdangerous", "lessdangerousthancoding"));
        System.out.println(longest("inmanylanguages", "theresapairoffunctions"));
    }
}
