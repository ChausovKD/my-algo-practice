package kyu7.filter_the_number;

/*
    Task: Filter the number (7 kyu)
    URL: https://www.codewars.com/kata/55b051fac50a3292a9000025/java

    Description: Oh, no! The number has been mixed up with the text. Your goal is to retrieve the number from the text,
    can you return the number back to its original state? Your task is to return a number from a string. You will be
    given a string of numbers and letters mixed up, you have to return all the numbers in that string in the order they
    occur.

    Input: "123"
    Output: 123

    Input: "a1b2c3"
    Output: 123

    Input: "aa1bb2cc3dd"
    Output: 123
*/

public class Main {

    public static long filterString(final String value) {
        StringBuilder stringBuilder = new StringBuilder();
        for (char i : value.toCharArray()) {
            if (Character.isDigit(i)) {
                stringBuilder.append(i);
            }
        }
        return Long.parseLong(stringBuilder.toString());
    }

    public static void main(String[] args) {
        System.out.println(filterString("123"));
        System.out.println(filterString("a1b2c3"));
        System.out.println(filterString("aa1bb2cc3dd"));
    }
}
