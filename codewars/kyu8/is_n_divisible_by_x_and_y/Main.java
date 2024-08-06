package kyu8.is_n_divisible_by_x_and_y;

/*
    Task: Is n divisible by x and y? (8 kyu)
    URL: https://www.codewars.com/kata/5545f109004975ea66000086/java

    Description: Create a function that checks if a number n is divisible by two numbers x AND y. All inputs are
    positive, non-zero numbers.

    Input: 3 1 3
    Output: true
    Explanation: 3 is divisible by 1 and 3

    Input: 12 2 6
    Output: true

    Input: 100 5 3
    Output: false
*/

public class Main {

    public static boolean isDivisible(long n, long x, long y) {
        return n % x == 0 && n % y == 0;
    }

    public static void main(String[] args) {
        System.out.println(isDivisible(3, 1, 3)); // true
    }
}
