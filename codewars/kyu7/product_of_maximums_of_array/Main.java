package kyu7.product_of_maximums_of_array;

/*
    Task: Product Of Maximums Of Array (Array Series #2) (7 kyu)
    URL: https://www.codewars.com/kata/5a63948acadebff56f000018

    Description: Given an array/list [] of integers , Find the product of the k maximal numbers. Array/list size is at
    least 3. Array/list's numbers Will be mixture of positives , negatives and zeros. Repetition of numbers in the
    array/list could occur.

    maxProduct ({4, 3, 5}, 2) ==>  return (20). Since the size (k) equal 2 , then the subsequence of size 2 whose gives
    product of maxima is 5 * 4 = 20.

    maxProduct ({8, 10 , 9, 7}, 3) ==>  return (720). Since the size (k) equal 3 , then the subsequence of size 3 whose
    gives product of maxima is  8 * 9 * 10 = 720 .
*/

import java.util.*;

public class Main {
    public static long maxProduct(int[] numbers, int sub_size) {
        Arrays.sort(numbers);
        long result = 1;
        for (int i = numbers.length-1; sub_size > 0; i--, sub_size--) {
            result *= numbers[i];
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(maxProduct(new int[] {4, 3, 5}, 2)); // 20
        System.out.println(maxProduct(new int[] {10, 8, 7, 9}, 3)); // 720
        System.out.println(maxProduct(new int[] {-4, -27, -15, -6, -1}, 2)); // 4
    }
}