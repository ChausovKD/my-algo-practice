package kyu8.function_2_squaring_an_argument;

/*
    Task: Function 2 - squaring an argument (8 kyu)
    URL: https://www.codewars.com/kata/523b623152af8a30c6000027

    Description: Now you have to write a function that takes an argument and returns the square of it.

    Input: 2
    Output: 4

    Input: 50
    Output: 2500

    Input: 1
    Output: 1
*/

public class Main {

    public static int square(int n) {
        return (int) Math.pow(n, 2);
    }

    public static void main(String[] args) {
        System.out.println(square(2));
        System.out.println(square(50));
        System.out.println(square(1));
    }
}
