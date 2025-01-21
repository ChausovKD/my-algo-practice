package kyu8.simple_validation_of_a_username_with_regex;

/*
    Task: Simple validation of a username with regex (8 kyu)
    URL: https://www.codewars.com/kata/56a3f08aa9a6cc9b75000023

    Description: Write a simple regex to validate a username. Allowed characters are:
        - lowercase letters,
        - numbers,
        - underscore
    Length should be between 4 and 16 characters (both included).

    Input: "regex"
    Output: true

    Input: "Hasd_12assssssasasasasasaasasasasas"
    Output: false

    Input: "p1pp1"
    Output: true
*/

public class Main {

    public static boolean validateUsr(String s) {
        return s.matches("^[a-z0-9_]{4,16}$");
    }

    public static void main(String[] args) {
        System.out.println(validateUsr(""));
        System.out.println(validateUsr("regex"));
        System.out.println(validateUsr("Hasd_12assssssasasasasasaasasasasas"));
        System.out.println(validateUsr("p1pp1"));
    }
}
