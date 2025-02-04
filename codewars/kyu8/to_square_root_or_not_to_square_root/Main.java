package kyu8.to_square_root_or_not_to_square_root;

/*
    Task: To square(root) or not to square(root) (8 kyu)
    URL: https://www.codewars.com/kata/57f6ad55cca6e045d2000627

    Description: Write a method, that will get an integer array as parameter and will process every number from this
    array. Return a new array with processing every number of the input-array like this: If the number has an integer
    square root, take this, otherwise square the number. The input array will always contain only positive numbers, and
    will never be empty or null.

    Input: {4, 3, 9, 7, 2, 1}
    Output: {2, 9, 3, 49, 4, 1}

    Input: {100, 101, 5, 5, 1, 1}
    Output: {10, 10201, 25, 25, 1, 1}
*/

import java.util.Arrays;

public class Main {

    public static int[] squareOrSquareRoot(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int squareRoot = (int) Math.sqrt(array[i]);
            if (squareRoot * squareRoot == array[i]) {
                array[i] = squareRoot;
            } else {
                array[i] = array[i] * array[i];
            }
        }
        return array;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(squareOrSquareRoot(new int[] {4, 3, 9, 7, 2, 1})));
        System.out.println(Arrays.toString(squareOrSquareRoot(new int[] {100, 101, 5, 5, 1, 1})));
        System.out.println(Arrays.toString(squareOrSquareRoot(new int[] {1, 2, 3, 4, 5, 6})));
    }
}
