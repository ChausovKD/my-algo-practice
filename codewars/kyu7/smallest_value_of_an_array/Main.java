package kyu7.smallest_value_of_an_array;

/*
    Task: Smallest value of an array (7 kyu)
    URL: https://www.codewars.com/kata/544a54fd18b8e06d240005c0

    Description: Write a function that can return the smallest value of an array or the index of that value. The
    function's 2nd parameter will tell whether it should return the value or the index. Assume the first parameter will
    always be an array filled with at least 1 number and no duplicates. Assume the second parameter will be a string
    holding one of two values: 'value' and 'index'.

    findSmallest(new int[]{1,2,3,4,5}, 'value') // => 1
    findSmallest(new int[]{1,2,3,4,5}, 'index') // => 0
*/

public class Main {

    public static int findSmallest(final int[] numbers, final String toReturn) {
        int indMinValue = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < numbers[indMinValue]) {
                indMinValue = i;
            }
        }
        if (toReturn.equals("value")) {
            return numbers[indMinValue];
        }
        return indMinValue;
    }

    public static void main(String[] args) {
        System.out.println(findSmallest(new int[]{1,2,3,4,5}, "value"));
        System.out.println(findSmallest(new int[]{1,2,3,4,5}, "index"));
    }
}
