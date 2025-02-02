package kyu8.get_the_mean_of_an_array;

/*
    Task: Get the mean of an array (8 kyu)
    URL: https://www.codewars.com/kata/563e320cee5dddcf77000158

    Description: It's the academic year's end, fateful moment of your school report. The averages must be calculated.
    All the students come to you and entreat you to calculate their average for them. Easy ! You just need to write a
    script. Return the average of the given array rounded down to its nearest integer. The array will never be empty.

    Input: {2,2,2,2}
    Output: 2

    Input: {1,2,3,4,5}
    Output: 3

    Input: {1,1,1,1,1,1,1,2}
    Output: 1
*/

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println(getAverage(new int[] {2,2,2,2}));
        System.out.println(getAverage(new int[] {1,2,3,4,5}));
        System.out.println(getAverage(new int[] {1,1,1,1,1,1,1,2}));
    }

    public static int getAverage(int[] marks){
        return Arrays.stream(marks).sum() / marks.length;
    }
}
