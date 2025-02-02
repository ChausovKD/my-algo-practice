package kyu8.no_zeros_for_heros;

/*
    Task: No zeros for heros (8 kyu)
    URL: https://www.codewars.com/kata/570a6a46455d08ff8d001002

    Description: Numbers ending with zeros are boring. They might be fun in your world, but not here. Get rid of them.
    Only the ending ones. Zero alone is fine, don't worry about it. Poor guy anyway

    Input: 1450
    Output: 145

    Input: 960000
    Output: 96

    Input: 1050
    Output: 105
*/

public class Main {

    public static int noBoringZeros(int n) {
        while (n % 10 == 0 && n != 0) {
            n /= 10;
        }
        return n;
    }

    public static void main(String[] args) {
        System.out.println(noBoringZeros(1450));
        System.out.println(noBoringZeros(-1050));
    }
}
