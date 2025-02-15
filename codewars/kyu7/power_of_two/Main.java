package kyu7.power_of_two;

/*
    Task: Power of two (7 kyu)
    URL: https://www.codewars.com/kata/534d0a229345375d520006a0

    Description: Complete the function kyu_7.power_of_two/powerOfTwo (or equivalent, depending on your language) that
    determines if a given non-negative integer is a power of two. From the corresponding Wikipedia entry: "a power of
    two is a number of the form 2n where n is an integer, i.e. the result of exponentiation with number two as the base
    and integer n as the exponent." You may assume the input is always valid. Beware of certain edge cases - for
    example, 1 is a power of 2 since 2^0 = 1 and 0 is not a power of 2.

    Input: 1024
    Output: true

    Input: 4096
    Output: true

    Input: 333
    Output: false
*/

public class Main {
    public static boolean isPowerOfTwo(long n) {
        return Long.bitCount(n) == 1;
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(2));
        System.out.println(isPowerOfTwo(4096));
        System.out.println(isPowerOfTwo(8));
        System.out.println(isPowerOfTwo(32));
        System.out.println(isPowerOfTwo(9));
    }
}
