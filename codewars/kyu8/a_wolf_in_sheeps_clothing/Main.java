package kyu8.a_wolf_in_sheeps_clothing;

/*
    Task: A wolf in sheep's clothing (8 kyu)
    URL: https://www.codewars.com/kata/5c8bfa44b9d1192e1ebd3d15

    Description: Wolves have been reintroduced to Great Britain. You are a sheep farmer, and are now plagued by wolves
    which pretend to be sheep. Fortunately, you are good at spotting them. Warn the sheep in front of the wolf that it
    is about to be eaten. Remember that you are standing at the front of the queue which is at the end of the array:
    [sheep, sheep, sheep, sheep, sheep, wolf, sheep, sheep]      (YOU ARE HERE AT THE FRONT OF THE QUEUE)
       7      6      5      4      3            2      1
    If the wolf is the closest animal to you, return "Pls go away and stop eating my sheep". Otherwise, return "Oi!
    Sheep number N! You are about to be eaten by a wolf!" where N is the sheep's position in the queue. Note: there will
    always be exactly one wolf in the array.

    Input: {"sheep", "sheep", "sheep", "wolf", "sheep"}
    Output: "Oi! Sheep number 1! You are about to be eaten by a wolf!"

    Input: {"sheep", "sheep", "wolf"}
    Output: "Pls go away and stop eating my sheep"
*/

public class Main {

    public static String warnTheSheep(String[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i].equals("wolf")) {
                return "Oi! Sheep number " + (array.length - i - 1) + "! You are about to be eaten by a wolf!";
            }
        }
        return "Pls go away and stop eating my sheep";
    }

    public static void main(String[] args) {
        System.out.println(warnTheSheep(new String[] {"sheep", "sheep", "sheep", "sheep", "sheep", "wolf", "sheep",
                "sheep"}));
        System.out.println(warnTheSheep(new String[] {"sheep", "wolf", "sheep", "sheep", "sheep", "sheep", "sheep"}));
        System.out.println(warnTheSheep(new String[] {"sheep", "sheep", "sheep", "wolf", "sheep"}));
        System.out.println(warnTheSheep(new String[] {"sheep", "sheep", "wolf"}));
        System.out.println(warnTheSheep(new String[] {"wolf", "sheep", "sheep", "sheep", "sheep", "sheep", "sheep"}));
        System.out.println(warnTheSheep(new String[] {"sheep", "sheep", "sheep", "sheep", "sheep", "sheep", "wolf"}));
    }
}
