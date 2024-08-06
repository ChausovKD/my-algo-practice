package kyu6.find_the_odd_int;

/*
    Task: Find the odd int (6 kyu)
    URL: https://www.codewars.com/kata/54da5a58ea159efa38000836

    Description: Given an array of integers, find the one that appears an odd number of times. There will always be only
    one integer that appears an odd number of times.

    Input: {20,1,-1,2,-2,3,3,5,5,1,2,4,20,4,-1,-2,5}
    Output: 5

    Input: {1,1,2,-2,5,2,4,4,-1,-2,5}
    Output: -1

    Input: {1,2,2,3,3,3,4,3,3,3,2,2,1}
    Output: 4
*/

public class Main {

    public static void main(String[] args) {
        System.out.println(Main.findIt(new int[] {20,1,-1,2,-2,3,3,5,5,1,2,4,20,4,-1,-2,5})); // 5
        System.out.println(Main.findIt(new int[] {1,1,2,-2,5,2,4,4,-1,-2,5})); // -1
        System.out.println(Main.findIt(new int[] {1,1,1,1,1,1,10,1,1,1,1})); // 10
        System.out.println(Main.findIt(new int[] {5,4,3,2,1,5,4,3,2,10,10})); // 1
        System.out.println(Main.findIt(new int[] {10})); // 10
        System.out.println(Main.findIt(new int[] {1,2,2,3,3,3,4,3,3,3,2,2,1})); // 4
    }

    public static int findIt(int[] a) {
        int result = 0;
        for (int i = 0; i < a.length; i++) {
            result ^= a[i];
        }
        return result;
    }
}
