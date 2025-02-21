package kyu7.sort_the_gift_code;

/*
    Task: Sort the Gift Code (7 kyu)
    URL: https://www.codewars.com/kata/52aeb2f3ad0e952f560005d3

    Description: Happy Holidays fellow Code Warriors! Santa's senior gift organizer Elf developed a way to represent up
    to 26 gifts by assigning a unique alphabetical character to each gift. After each gift was assigned a character, the
    gift organizer Elf then joined the characters to form the gift ordering code.
    Santa asked his organizer to order the characters in alphabetical order, but the Elf fell asleep from consuming too
    much hot chocolate and candy canes! Can you help him out?
    Write a function called sortGiftCode/sort_gift_code/SortGiftCode that accepts a string containing up to 26 unique alphabetical characters, and returns a string containing the same characters in alphabetical order.

    Input: "abcdef"
    Output: "abcdef"

    Input: "zyxwvutsrqponmlkjihgfedcba"
    Output: "abcdefghijklmnopqrstuvwxyz"
*/

import java.util.Arrays;

public class Main {
    public static String sortGiftCode(String code){
        char[] charArray = code.toCharArray();
        Arrays.sort(charArray);
        return new String(charArray);
    }

    public static void main(String[] args) {
        System.out.println(sortGiftCode("abcdef"));
        System.out.println(sortGiftCode("zyxwvutsrqponmlkjihgfedcba"));
    }
}
