package kyu8.find_numbers_which_are_divisible_by_given_number;

/*
    Task: Find numbers which are divisible by given number (8 kyu)
    URL: https://www.codewars.com/kata/55edaba99da3a9c84000003b

    Description: Complete the function which takes two arguments and returns all numbers which are divisible by the
    given divisor. First argument is an array of numbers and the second is the divisor.

    Input: {1,2,3,4,5,6}, 2
    Output: {2,4,6}

    Input: {1,2,3,4,5,6}, 3
    Output: {3,6}

    Input: {0,1,2,3,4,5,6}, 4
    Output: {0,4}
*/

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(divisibleBy(new int[] {1,2,3,4,5,6},2)));
        System.out.println(Arrays.toString(divisibleBy(new int[] {1,2,3,4,5,6},3)));
        System.out.println(Arrays.toString(divisibleBy(new int[] {0,1,2,3,4,5,6},4)));
    }

    public static int[] divisibleBy(int[] numbers, int divider) {
//        List<Integer> result = new ArrayList<>();
//        for (int item : numbers) {
//            if (item % divider == 0) {
//                result.add(item);
//            }
//        }
//        return result.stream().mapToInt(Integer::intValue).toArray();

        return Arrays.stream(numbers).filter(i -> (i % divider) == 0).toArray();
    }
}
