package kyu8.vowel_remover;

/*
    Task: Vowel remover (8 kyu)
    URL: https://www.codewars.com/kata/5547929140907378f9000039

    Description: Create a function called shortcut to remove the lowercase vowels (a, e, i, o, u) in a given string.
    Don't worry about uppercase vowels. 'y' is not considered a vowel for this kata.

    Input: "hello"
    Output: "hll"

    Input: "codewars"
    Output: "cdwrs"
*/

public class Main {

    public static void main(String[] args) {
        System.out.println(shortcut("Hello"));
        System.out.println(shortcut("goodbye"));
        System.out.println(shortcut("HELLO"));
    }

    public static String shortcut(String input) {
        return input.replaceAll("[aeiou]", "");
    }
}
