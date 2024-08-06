package kyu7.simple_beads_count;

/*
    Task: Simple beads count (7 kyu)
    URL: https://www.codewars.com/kata/58712dfa5c538b6fc7000569

    Description: Two red beads are placed between every two blue beads. There are N blue beads. After looking at the
    arrangement below work out the number of red beads.
        @ @@ @ @@ @ @@ @ @@ @ @@ @
        b rr b rr b rr b rr b rr b
    Implement count_red_beads(n) (in PHP count_red_beads($n); in Java, Javascript, TypeScript, C, C++ countRedBeads(n))
    so that it returns the number of red beads. If there are less than 2 blue beads return 0.

    Input: 3
    Output: 4

    Input: 5
    Output: 8
*/

public class Main {

    public static int countRedBeads(final int nBlue) {
        if (nBlue < 2) {
            return 0;
        } else {
            return 2 * (nBlue - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(countRedBeads(0)); // 0
        System.out.println(countRedBeads(3)); // 4
        System.out.println(countRedBeads(5)); // 8
    }
}
