package kyu8.bin_to_decimal;

/*
    Task: Bin to Decimal (8 kyu)
    URL: https://www.codewars.com/kata/57a5c31ce298a7e6b7000334/java

    Description: Complete the function which converts a binary number (given as a string) to a decimal number.

    Input: "1"
    Output: 1

    Input: "0"
    Output: 0

    Input: "1001001"
    Output: 73
*/

public class Main {
    public static int binToDecimal(String inp){
        return Integer.parseInt(inp, 2);
    }

    public static void main(String[] args) {
        System.out.println(binToDecimal("1"));
        System.out.println(binToDecimal("0"));
        System.out.println(binToDecimal("1001001"));
    }
}
