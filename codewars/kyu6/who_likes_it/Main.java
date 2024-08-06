package kyu6.who_likes_it;

/*
    Task: Who likes it? (6 kyu)
    URL: https://www.codewars.com/kata/5266876b8f4bf2da9b000362

    Description: You probably know the "like" system from Facebook and other pages. People can "like" blog posts,
    pictures or other items. We want to create the text that should be displayed next to such an item. Implement the
    function which takes an array containing the names of people that like an item. For 4 or more names, the number in
    "and 2 others" simply increases.

    Input: {}
    Output: "no one likes this"

    Input: {"Peter"}
    Output: "Peter likes this"

    Input: {"Alex", "Jacob", "Mark", "Max"}
    Output: "Alex, Jacob and 2 others like this"
*/

public class Main {

    public static void main(String[] args) {
        System.out.println(Main.whoLikesIt());
        System.out.println(Main.whoLikesIt("Peter"));
        System.out.println(Main.whoLikesIt("Jacob", "Alex"));
        System.out.println(Main.whoLikesIt("Max", "John", "Mark"));
        System.out.println(Main.whoLikesIt("Alex", "Jacob", "Mark", "Max"));

    }


    public static String whoLikesIt(String... names) {
        switch (names.length) {
            case 0 -> {
                return "no one likes this";
            }
            case 1 -> {
                return String.format("%s likes this", names[0]);
            }
            case 2 -> {
                return String.format("%s and %s like this", names[0], names[1]);
            }
            case 3 -> {
                return String.format("%s, %s and %s like this", names[0], names[1], names[2]);
            }
            default -> {
                return String.format("%s, %s and %d others like this", names[0], names[1], names.length - 2);
            }
        }
    }
}
