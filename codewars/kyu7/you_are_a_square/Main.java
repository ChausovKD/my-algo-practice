package kyu7.you_are_a_square;

/*
    Task: You're a square! (7 kyu)
    URL: https://www.codewars.com/kata/54c27a33fb7da0db0100040e

    Description: You like building blocks. You especially like building blocks that are squares. And what you even like
    more, is to arrange them into a square of square building blocks! However, sometimes, you can't arrange them into a
    square. Instead, you end up with an ordinary rectangle! Those blasted things! If you just had a way to know whether
    you're currently working in vain… Wait! That's it! You just have to check if your number of building blocks is a
    perfect square.
    Given an integral number, determine if it's a square number (https://en.wikipedia.org/wiki/Square_number): "In
    mathematics, a square number or perfect square is an integer that is the square of an integer; in other words, it is
    the product of some integer with itself."

    Input: -1
    Output: false

    Input: 25
    Output: true

    Input: 3
    Output: false
*/

public class Main {
    public static void main(String[] args) {
        System.out.println(isSquare(-1));
        System.out.println(isSquare(0));
        System.out.println(isSquare(3));
        System.out.println(isSquare(4));
        System.out.println(isSquare(25));

    }

    public static boolean isSquare(int n) {
        return Math.sqrt(n) % 1 == 0;

//        return Math.pow((int) Math.sqrt(n), 2) == n;
    }
}
