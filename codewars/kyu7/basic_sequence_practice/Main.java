package kyu7.basic_sequence_practice;

/*
    Task: Basic Sequence Practice (7 kyu)
    URL: https://www.codewars.com/kata/5436f26c4e3d6c40e5000282

    Description: A sequence or a series (https://mathigon.org/course/sequences/introduction), in mathematics, is a
    string of objects, like numbers, that follow a particular
    pattern. The individual elements in a sequence are called terms. A simple example is 3, 6, 9, 12, 15, 18, 21, ...,
    where the pattern is: "add 3 to the previous term". In this kata, we will be using a more complicated sequence:
    0, 1, 3, 6, 10, 15, 21, 28, ... This sequence is generated with the pattern: "the nth term is the sum of numbers
    from 0 to n, inclusive".
                                    [ 0, |  1,  |   3,    |    6,   | ...]
                                      0  | 0+1  | 0+1+2   | 0+1+2+3 |
    Complete the function that takes an integer n and returns a list/array of length abs(n) + 1 of the arithmetic series
    explained above. When n < 0 return the sequence with negative terms.

    Input: 5
    Output: {0, 1, 3, 6, 10, 15}

    Input: -5
    Output: {0, -1, -3, -6, -10, -15}

    Input: 7
    Output: {0,  1,  3,  6,  10,  15,  21,  28}
*/

import java.util.Arrays;

public class Main {

    public static int[] sumOfN(int n) {
        int[] result = new int[Math.abs(n) + 1];
        for (int i = 1; i < result.length; i++) {
            result[i] = result[i-1] + (n > 0 ? i : -i);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sumOfN(3)));
        System.out.println(Arrays.toString(sumOfN(5)));
        System.out.println(Arrays.toString(sumOfN(-5)));
        System.out.println(Arrays.toString(sumOfN(7)));
        System.out.println(Arrays.toString(sumOfN(-4)));
        System.out.println(Arrays.toString(sumOfN(1)));
        System.out.println(Arrays.toString(sumOfN(0)));
    }
}
