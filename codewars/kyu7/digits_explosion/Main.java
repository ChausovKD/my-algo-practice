package kyu7.digits_explosion;

/*
    Task: Digits explosion (7 kyu)
    URL: https://www.codewars.com/kata/585b1fafe08bae9988000314

    Description: Given a string made of digits [0-9], return a string where each digit is repeated a number of times
    equals to its value.

    Input: "312"
    Output: "333122"

    Input: "102269"
    Output: "12222666666999999999"

    Input: "691583674023"
    Output: "666666999999999155555888888883336666667777777444422333"
*/

public class Main {
    public static void main(String[] args) {
        System.out.println(explode("312"));
        System.out.println(explode("102269"));
        System.out.println(explode("691583674023"));
    }

    public static String explode(String digits) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < digits.length(); i++) {
            str.append(String.valueOf(digits.charAt(i)).repeat(Math.max(0, Character.getNumericValue(digits.charAt(i)))));
        }
        return str.toString();
    }
}
