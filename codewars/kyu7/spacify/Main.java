package kyu7.spacify;

/*
    Task: Spacify (7 kyu)
    URL: https://www.codewars.com/kata/57f8ee485cae443c4d000127

    Description: Modify the kyu_7.spacify function so that it returns the given string with spaces inserted between each
    character.

    kyu_7.spacify("hello world") // returns "h e l l o   w o r l d"
*/

public class Main {
    public static String spacify(String str) {
        if (str != null) {
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(str.charAt(0)));
            for (int i = 1; i < str.length(); i++) {
                stringBuilder.append(" ").append(str.charAt(i));
            }
            return stringBuilder.toString();
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println(spacify("hello world"));
    }
}
