package kyu8.invert_values;

/*
    Task: Invert values (8 kyu)
    URL: https://www.codewars.com/kata/5899dc03bc95b1bf1b0000ad

    Description: Given a set of numbers, return the additive inverse of each. Each positive becomes negatives, and the
    negatives become positives.

    Input: {1, 2, 3, 4, 5}
    Output: {-1, -2, -3, -4, -5}

    Input: {1, -2, 3, -4, 5}
    Output: {-1, 2, -3, 4, -5}

    Input: {}
    Output: {}
*/

import java.util.Arrays;

public class Main {

    public static int[] invert(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = -array[i];
        }
        return array;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(invert(new int[] {1,2,3,4,5})));
        System.out.println(Arrays.toString(invert(new int[] {1,-2,3,-4,5})));
        System.out.println(Arrays.toString(invert(new int[] {})));
    }
}
