package kyu8.quarter_of_the_year;

/*
    Task: Quarter of the year (8 kyu)
    URL: https://www.codewars.com/kata/5ce9c1000bab0b001134f5af

    Description: Given a month as an integer from 1 to 12, return to which quarter of the year it belongs as an integer
    number.
    For example: month 2 (February), is part of the first quarter; month 6 (June), is part of the second quarter; and
    month 11 (November), is part of the fourth quarter.

    Constraint:
    1 <= month <= 12
*/

public class Main {
    public static void main(String[] args) {
        System.out.println(quarterOf(3));
        System.out.println(quarterOf(8));
        System.out.println(quarterOf(11));
    }

    public static int quarterOf(int month) {
        return (int) Math.ceil(month / 3.);
    }
}
