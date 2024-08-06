package kyu6.split_strings;

/*
  Task: Split Strings (6 kyu)
  URL: https://www.codewars.com/kata/515de9ae9dcfc28eb6000001

  Description: Complete the solution so that it splits the string into pairs of two characters. If the string contains
  an odd number of characters then it should replace the missing second character of the final pair with an underscore
  ('_').

  'abc' =>  ['ab', 'c_']
  'abcdef' => ['ab', 'cd', 'ef']
*/

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution("abcdef")));
        System.out.println(Arrays.toString(solution("HelloWorld")));
        System.out.println(Arrays.toString(solution("abcde")));
        System.out.println(Arrays.toString(solution("LovePizza")));
    }

    public static String[] solution(String s) {
        if (s.length() % 2 == 0) {
            return s.split("(?<=\\G.{2})");
        } else {
            return (s + "_").split("(?<=\\G.{2})");
        }
    }
}
