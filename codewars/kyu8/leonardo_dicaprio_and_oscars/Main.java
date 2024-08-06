package kyu8.leonardo_dicaprio_and_oscars;

/*
    Task: Leonardo Dicaprio and Oscars (8 kyu)
    URL: https://www.codewars.com/kata/56d49587df52101de70011e4/java

    Description: You have to write a function that describe Leo:
        def leo(oscar):
          pass
    - if oscar was (integer) 88, you have to return "Leo finally won the oscar! Leo is happy".
    - if oscar was 86, you have to return "Not even for Wolf of wallstreet?!"
    - if it was not 88 or 86 (and below 88) you should return "When will you give Leo an Oscar?"
    - if it was over 88 you should return "Leo got one already!"

    Input: 88
    Output: "Leo finally won the oscar! Leo is happy"

    Input: 87
    Output: "When will you give Leo an Oscar?"

    Input: 86
    Output: "Not even for Wolf of wallstreet?!"
*/

public class Main {

    public static void main(String[] args) {
        System.out.println(leo(88));

        System.out.println(leo(86));

        System.out.println(leo(87));
        System.out.println(leo(83));
        System.out.println(leo(85));

        System.out.println(leo(95));
    }

    public static String leo(final int oscar) {
        if (oscar == 88) {
            return "Leo finally won the oscar! Leo is happy";
        } else if (oscar == 86) {
            return "Not even for Wolf of wallstreet?!";
        } else if (oscar < 88) {
            return "When will you give Leo an Oscar?";
        } else {
            return "Leo got one already!";
        }
    }
}
