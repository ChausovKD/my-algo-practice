package kyu8.array_plus_array;

/*
    Task: Array plus array (8 kyu)
    URL: https://www.codewars.com/kata/5a2be17aee1aaefe2a000151

    Description: I'm new to coding, and now I want to get the sum of two arrays... Actually the sum of all their
    elements. I'll appreciate for your help. P.S. Each array includes only integer numbers. Output is a number too.

    Input: {100,200,300} {400,500,600}
    Output: 2100

    Input: {1,2,3} {4,5,6}
    Output: 21
*/

public class Main {

    public static int arrayPlusArray(int[] arr1, int[] arr2) {
        int sum = 0;
        for (int k : arr1) {
            sum += k;
        }
        for (int j : arr2) {
            sum += j;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(arrayPlusArray(new int[] {100,200,300}, new int[] {400,500,600})); // 2100
        System.out.println(arrayPlusArray(new int[] {0,0,0}, new int[]{4,5,6})); // 15
        System.out.println(arrayPlusArray(new int[] {1,2,3}, new int[]{4,5,6})); // 21
    }
}
