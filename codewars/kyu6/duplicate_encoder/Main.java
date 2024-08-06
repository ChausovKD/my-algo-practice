package kyu6.duplicate_encoder;

/*
    Task: Duplicate Encoder (6 kyu)
    URL: https://www.codewars.com/kata/54b42f9314d9229fd6000d9c

    Description: The goal of this exercise is to convert a string to a new string where each character in the new string
    is "(" if that character appears only once in the original string, or ")" if that character appears more than once
    in the original string. Ignore capitalization when determining if a character is a duplicate. Assertion messages may
    be unclear about what they display in some languages. If you read "...It Should encode XXX", the "XXX" is the
    expected result, not the input!

    "din"      =>  "((("
    "recede"   =>  "()()()"
    "Success"  =>  ")())())"
    "(( @"     =>  "))(("
*/

import java.util.Arrays;

public class Main {

    public static class DuplicateEncoder {
        static String encode(String word) {
            word = word.toLowerCase();
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < word.length(); i++) {
                String temp = word.substring(i, i + 1);
                int count = (int) Arrays.stream(word.split(""))
                        .filter(temp::equals)
                        .count();
                if (count == 1) stringBuilder.append("(");
                else stringBuilder.append(")");
            }
            return stringBuilder.toString();
        }

        public static void main(String[] args) {
            System.out.println(encode("din"));
            System.out.println(encode("recede"));
            System.out.println(encode("(( @"));
        }
    }
}
