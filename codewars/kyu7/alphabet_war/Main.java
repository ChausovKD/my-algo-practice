package kyu7.alphabet_war;

/*
    Task: Alphabet war (7 kyu)
    URL: https://www.codewars.com/kata/59377c53e66267c8f6000027

    Description: There is a war and nobody knows - the alphabet war! There are two groups of hostile letters. The
    tension between left side letters and right side letters was too high and the war began.
    Write a function that accepts fight string consists of only small letters and return who wins the fight. When the
    left side wins return "Left side wins!", when the right side wins return "Right side wins!", in other case return
    "Let's fight again!".
    The left side letters and their power:
         w - 4, p - 3, b - 2, s - 1
    The right side letters and their power:
         m - 4, q - 3, d - 2, z - 1
    The other letters don't have power and are only victims.

    Input: "z"
    Output: "Right side wins!"

    Input: "zdqmwpbs"
    Output: "Let's fight again!"

    Input: "zzzzs"
    Output: "Right side wins!"
*/

public class Main {

    public static String alphabetWar(String fight) {
        int sumLeft = 0;
        int sumRight = 0;

        for (char item : fight.toCharArray()) {
            switch (item) {
                case 'w' -> {
                    sumLeft += 4;
                }
                case 'p' -> {
                    sumLeft += 3;
                }
                case 'b' -> {
                    sumLeft += 2;
                }
                case 's' -> {
                    sumLeft += 1;
                }
                case 'm' -> {
                    sumRight += 4;
                }
                case 'q' -> {
                    sumRight += 3;
                }
                case 'd' -> {
                    sumRight += 2;
                }
                case 'z' -> {
                    sumRight += 1;
                }
            }
        }

        if (sumLeft > sumRight) {
            return "Left side wins!";
        } else if (sumLeft < sumRight) {
            return "Right side wins!";
        } else {
            return "Let's fight again!";
        }
    }

    public static void main(String[] args) {
        System.out.println(alphabetWar("z"));
        System.out.println(alphabetWar("zdqmwpbs"));
        System.out.println(alphabetWar("zzzzs"));
        System.out.println(alphabetWar("wwwwwwz"));
    }
}
