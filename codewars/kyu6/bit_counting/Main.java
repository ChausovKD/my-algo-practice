package kyu6.bit_counting;

/*
    Task: Bit Counting (6 kyu)
    URL: https://www.codewars.com/kata/526571aae218b8ee490006f4

    Description: Write a function that takes an integer as input, and returns the number of bits that are equal to one
    in the binary representation of that number. You can guarantee that input is non-negative. Example: The binary
    representation of 1234 is 10011010010, so the function should return 5 in this case

    Input: 1234
    Output: 5

    Input: 4
    Output: 1

    Input: 77231418
    Output: 14
*/

public class Main {

    public static void main(String[] args) {
        System.out.println(countBits(1234));
        System.out.println(countBits(4));
        System.out.println(countBits(77231418));
        System.out.println(countBits(7));
        System.out.println(countBits(9));
        System.out.println(countBits(10));
    }

    public static int countBits(int n){
//        int bit = n % 2;
//        while ((n /= 2) > 0) bit += n % 2;
//        return bit;

//        return Integer.toBinaryString(n).replace("0", "").length();
        return Integer.bitCount(n);
    }
}
