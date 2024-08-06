package kyu8.removing_elements;

/*
    Task: Removing Elements (8 kyu)
    URL: https://www.codewars.com/kata/5769b3802ae6f8e4890009d2

    Description: Take an array and remove every second element from the array. Always keep the first element and start
    removing with the next element. None of the arrays will be empty, so you don't have to worry about that!

    Input: {"Hello", "Goodbye", "Hello Again"}
    Output: {Hello, Hello Again}

    Input: {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}
    Output: {1, 3, 5, 7, 9}
*/

import java.util.Arrays;

public class Main {

    public static Object[] removeEveryOther(Object[] arr) {
        Object[] newArr = new Object[(arr.length + 1) / 2];
        for (int i = 0, j = 0; i < arr.length; i += 2) {
            newArr[j++] = arr[i];
        }
        return newArr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(removeEveryOther(new Object[]{"Hello", "Goodbye", "Hello Again"})));
        System.out.println(Arrays.toString(removeEveryOther(new Object[]{new Object[] { 1, 2 }})));
        System.out.println(Arrays.toString(removeEveryOther(new Object[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10})));
        System.out.println(Arrays.toString(removeEveryOther(new Object[]{"Goodbye"})));
    }
}
