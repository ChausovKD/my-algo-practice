package kyu7.exes_and_ohs;

/*
    Task: Exes and Ohs (7 kyu)
    URL: https://www.codewars.com/kata/55908aad6620c066bc00002a

    Description: Check to see if a string has the same amount of 'x's and 'o's. The method must return a boolean and be
    case-insensitive. The string can contain any char.

    Input: "ooxx"
    Output: true

    Input: "xooxx"
    Output: false

    Input: "ooxXm"
    Output: true
*/

public class Main {

    public static boolean getXO (String str) {
        int countX = 0;
        int countO = 0;
        for (char i : str.toLowerCase().toCharArray()) {
            if (i == 'x') {
                countX++;
            } else if (i == 'o') {
                countO++;
            }
        }
        return countO == countX;
    }

    public static void main(String[] args) {
        System.out.println(getXO("ooxx"));
        System.out.println(getXO("xooxx"));
    }
}
