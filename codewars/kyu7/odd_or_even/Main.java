package kyu7.odd_or_even;

/*
    Task: Odd or Even? (7 kyu)
    URL: https://www.codewars.com/kata/5949481f86420f59480000e7

    Description: Given a list of integers, determine whether the sum of its elements is odd or even. Give your answer as
    a string matching "odd" or "even". If the input array is empty consider it as: [0] (array with a zero).

    Input: {2, 5, 34, 6}
    Output: "odd"

    Input: {0}
    Output: "even"
*/

public class Main {
    public static String oddOrEven (int[] array) {
        int sum = 0;
        for (int item : array) {
            sum += item;
        }
        if (sum % 2 == 0) {
            return "even";
        } else {
            return "odd";
        }
    }

    public static void main(String[] args) {
        System.out.println(oddOrEven(new int[] {2, 5, 34, 6}));
        System.out.println(oddOrEven(new int[] {0}));
        System.out.println(oddOrEven(new int[] {0, -1, -5}));
    }
}
