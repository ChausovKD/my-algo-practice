package kyu7.alphabet_symmetry;

/*
    Task: Alphabet symmetry (7 kyu)
    URL: https://www.codewars.com/kata/59d9ff9f7905dfeed50000b0

    Description: Consider the word "abode". We can see that the letter an is in position 1 and b is in position 2. In
    the alphabet, a and b are also in positions 1 and 2. Notice also that d and e in abode occupy the positions they
    would occupy in the alphabet, which are positions 4 and 5. Given an array of words, return an array of the number of
    letters that occupy their positions in the alphabet for each word. Input will consist of alphabet characters, both
    uppercase and lowercase. No spaces.

    Input: {"abode", "ABc", "xyzD"}
    Output: {4, 3, 1}

    Input: {"IAMDEFANDJKL", "thedefgh", "xyzDEFghijabc"}
    Output: {6, 5, 7}
*/

import java.util.Arrays;

public class Main {
    public static int[] solve(String[] arr) {
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            String str = arr[i].toLowerCase();
            int counter = 0;
            for (int j = 0; j < str.length(); j++) {
                char letter = str.charAt(j);
                if (letter - 'a' == j) {
                    counter++;
                }
            }
            result[i] = counter;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solve(new String[]{"abode", "ABc", "xyzD"})));
        System.out.println(Arrays.toString(solve(new String[]{"IAMDEFANDJKL", "thedefgh", "xyzDEFghijabc"})));
    }
}
