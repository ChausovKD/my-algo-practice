package kyu8.find_multiples_of_a_number;

/*
    Task: Find Multiples of a Number (8 kyu)
    URL: https://www.codewars.com/kata/58ca658cc0d6401f2700045f/java

    Description: In this simple exercise, you will build a program that takes a value, integer, and returns a list of
    its multiples up to another value, limit . If limit is a multiple of integer, it should be included as well. There
    will only ever be positive integers passed into the function, not consisting of 0. The limit will always be higher
    than the base. For example, if the parameters passed are (2, 6), the function should return [2, 4, 6] as 2, 4, and 6
    are the multiples of 2 up to 6.

    Input: 5 25
    Output: {5, 10, 15, 20, 25}

    Input: 1 2
    Output: {1, 2}
*/

import java.util.Arrays;

public class Main {

    public static int[] find(int base, int limit) {
        int[] result = new int[limit / base];
        for (int i = 0; i < result.length; i++) {
            result[i] = base * (i + 1);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(find(5, 25)));
        System.out.println(Arrays.toString(find(1, 2)));
        System.out.println(Arrays.toString(find(5, 7)));
        System.out.println(Arrays.toString(find(4, 27)));
        System.out.println(Arrays.toString(find(11, 54)));
    }
}
