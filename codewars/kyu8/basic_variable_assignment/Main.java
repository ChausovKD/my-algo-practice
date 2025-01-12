package kyu8.basic_variable_assignment;

/*
    Task: Basic variable assignment (8 kyu)
    URL: https://www.codewars.com/kata/50ee6b0bdeab583673000025

    Description: This code should store "codewa.rs" as a variable called name, but it's not working. Can you figure out
    why?
    Code:
    "public class Kata {
        public static String a == "code";
        public static String b == "wa.rs";
        public static String name == a + b;
    }"
*/

public class Main {

    public static String a = "code";
    public static String b = "wa.rs";
    public static String name = a + b;

    public static void main(String[] args) {
    }
}
