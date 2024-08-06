package kyu7.jaden_casing_strings;

/*
    Task: Jaden Casing Strings (7 kyu)
    URL: https://www.codewars.com/kata/5390bac347d09b7da40006f6

    Description: Jaden Smith, the son of Will Smith, is the star of films such as The Karate Kid (2010) and After Earth
    (2013). Jaden is also known for some of his philosophy that he delivers via Twitter. When writing on Twitter, he is
    known for almost always capitalizing every word. For simplicity, you'll have to capitalize each word, check out how
    contractions are expected to be in the example below. our task is to convert strings to how they would be written by
    Jaden Smith. The strings are actual quotes from Jaden Smith, but they are not capitalized in the same way he
    originally typed them. Note that the Java version expects a return value of null for an empty string or null.

    Input: "How can mirrors be real if our eyes aren't real"
    Output: "How Can Mirrors Be Real If Our Eyes Aren't Real"

    Input: "null"
    Output: "Null"
*/

public class Main {

    public static String toJadenCase(String phrase) {
        if (phrase == null || phrase.isEmpty()) {
            return null;
        }
        String[] strings = phrase.split(" ");
        StringBuilder stringBuilder = new StringBuilder().append(Character.toUpperCase(strings[0].charAt(0)))
                .append(strings[0].substring(1));
        for (int i = 1; i < strings.length; i++) {
            stringBuilder.append(" ")
                    .append(Character.toUpperCase(strings[i].charAt(0)))
                    .append(strings[i].substring(1));
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        System.out.println(toJadenCase("How can mirrors be real if our eyes aren't real"));
        System.out.println(toJadenCase("most trees are blue"));
        System.out.println(toJadenCase(""));
        System.out.println(toJadenCase("null"));
        System.out.println(toJadenCase(null));
    }
}
