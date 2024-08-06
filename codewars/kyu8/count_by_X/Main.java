package kyu8.count_by_X;

/*
    Task: Count by X (8 kyu)
    URL: https://www.codewars.com/kata/5513795bd3fafb56c200049e

    Description: Create a function with two arguments that will return an array of the first n multiples of x. Assume
    both the given number and the number of times to count will be positive numbers greater than 0. Return the results
    as an array or list (depending on language).

    countBy(1,10) // should return  {1,2,3,4,5,6,7,8,9,10}
    countBy(2,5) // should return {2,4,6,8,10}
*/

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(countBy(1,10)));
        System.out.println(Arrays.toString(countBy(2,5)));
        System.out.println(Arrays.toString(countBy(3,7)));
        System.out.println(Arrays.toString(countBy(50,5)));
        System.out.println(Arrays.toString(countBy(100,6)));
    }

    public static int[] countBy(int x, int n){
        int[] result = new int[n];
//        for (int i = 0, j = x; i < result.length; i++, j += x) {
//            result[i] = j;
//        }

        for (int i = 0; i < result.length; i++) {
            result[i] = (i + 1) * x;
        }
        return result;
    }
}
