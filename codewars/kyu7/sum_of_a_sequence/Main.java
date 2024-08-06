package kyu7.sum_of_a_sequence;

/*
    Task: Sum of a sequence (7 kyu)
    URL: https://www.codewars.com/kata/586f6741c66d18c22800010a

    Description: Your task is to write a function which returns the sum of a sequence of integers. The sequence is
    defined by 3 non-negative values: begin, end, step. If begin value is greater than the end, your function should
    return 0. If end is not the result of an integer number of steps, then don't add it to the sum. See the 4th example
    below.

    Input: 2 2 2
    Output: 2

    Input: 2 6 2
    Output: 12
    Explanation: 2 + 4 + 6

    Input: 1 5 1
    Output: 15
*/

public class Main {

    public static int sequenceSum(int start, int end, int step) {
        int sum = 0;
        for (int i = start; i <= end; i += step) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sequenceSum(2, 6, 2));
        System.out.println(sequenceSum(1, 5, 1));
        System.out.println(sequenceSum(1, 5, 3));
    }
}
