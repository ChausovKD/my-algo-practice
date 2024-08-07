package kyu6.street_fighter_2_character_selection;

/*
    Task: Street Fighter 2 - Character Selection (6 kyu)
    URL: https://www.codewars.com/kata/5853213063adbd1b9b0000be

    Description: You'll have to simulate the video game's character selection screen behaviour, more specifically the
    selection grid.
    Selection Grid Layout in text:
        | Ryu  | E.Honda | Blanka  | Guile   | Balrog | Vega    |
        | Ken  | Chun Li | Zangief | Dhalsim | Sagat  | M.Bison |
    Input:
    - the list of game characters in a 2x6 grid;
    - the initial position of the selection cursor (top-left is (0,0));
    - a list of moves of the selection cursor (which are up, down, left, right);
    Output:
    - the list of characters who have been hovered by the selection cursor after all the moves (ordered and with
    repetition, all the ones after a move, whether successful or not, see tests);
    Rules:
    Selection cursor is circular horizontally but not vertically! As you might remember from the game, the selection
    cursor rotates horizontally but not vertically; that means that if I'm in the leftmost and I try to go left again
    I'll get to the rightmost (examples: from Ryu to Vega, from Ken to M.Bison) and vice versa from rightmost to
    leftmost.
    Instead, if I try to go further up from the upmost or further down from the downmost, I'll just stay where I am
    located (examples: you can't go lower than lowest row: Ken, Chun Li, Zangief, Dhalsim, Sagat and M.Bison in the
    above image; you can't go upper than highest row: Ryu, E.Honda, Blanka, Guile, Balrog and Vega in the above image).
    Test
    For this easy version the fighters grid layout and the initial position will always be the same in all tests, only
    the list of moves change.
    Notice: changing some of the input data might not help you.
    Examples:
    1)      fighters = [
              ["Ryu", "E.Honda", "Blanka", "Guile", "Balrog", "Vega"],
              ["Ken", "Chun Li", "Zangief", "Dhalsim", "Sagat", "M.Bison"]
            ]
            initial_position = (0,0)
            moves = ['up', 'left', 'right', 'left', 'left']
    Result:
            ['Ryu', 'Vega', 'Ryu', 'Vega', 'Balrog']
    as the characters I've been hovering with the selection cursor during my moves. Notice: Ryu is the first just
    because it "fails" the first up See test cases for more examples.

    2)      fighters = [
              ["Ryu", "E.Honda", "Blanka", "Guile", "Balrog", "Vega"],
              ["Ken", "Chun Li", "Zangief", "Dhalsim", "Sagat", "M.Bison"]
            ]
            initial_position = (0,0)
            moves = ['right', 'down', 'left', 'left', 'left', 'left', 'right']
    Result:
            ['E.Honda', 'Chun Li', 'Ken', 'M.Bison', 'Sagat', 'Dhalsim', 'Sagat']
*/

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static String[] streetFighterSelection(String[][] fighters, int[] position, String[] moves) {
        int hCounter = position[0];
        int vCounter = position[1];
        ArrayList<String> listAffectedFighters = new ArrayList<>();
        for (String move : moves) {
            switch (move) {
                case "up" -> {
                    listAffectedFighters.add(fighters[(hCounter > 0 ?
                            --hCounter : hCounter) % fighters.length][vCounter]);
                }
                case "down" -> {
                    listAffectedFighters.add(fighters[(hCounter < fighters.length-1 ?
                            ++hCounter : hCounter) % fighters.length][vCounter]);
                }
                case "left" -> {
                    vCounter = (--vCounter + fighters[1].length) % fighters[1].length;
                    listAffectedFighters.add(fighters[hCounter][vCounter]);
                }
                case "right" -> {
                    vCounter = (++vCounter + fighters[1].length) % fighters[1].length;
                    listAffectedFighters.add(fighters[hCounter][vCounter]);
                }
                default -> {
                    break;
                }
            }
        }
        String[] affectedFighters = new String[listAffectedFighters.size()];
        return listAffectedFighters.toArray(affectedFighters);
    }

    public static void main(String[] args) {
        String[][] fighters = new String[][]{
                new String[] {"Ryu", "E.Honda", "Blanka", "Guile", "Balrog", "Vega"},
                new String[] {"Ken", "Chun Li", "Zangief", "Dhalsim", "Sagat", "M.Bison"},
        };

        String[][] moreFighters = new String[][]{
                new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"},
                new String[] {"11", "12", "13", "14", "15", "16", "17", "18", "19", "20"},
                new String[] {"21", "22", "23", "24", "25", "26", "27", "28", "29", "30"},
        };

        System.out.println(Arrays.toString(streetFighterSelection(fighters, new int[] {0, 0}, new String[] {"up",
                "left", "right", "left", "left"})));
        System.out.println(Arrays.toString(streetFighterSelection(fighters, new int[] {0, 0}, new String[] {"right",
                "down", "left", "left", "left", "left", "right"})));
        System.out.println(Arrays.toString(streetFighterSelection(fighters, new int[] {0, 0}, new String[] {"down",
                "down", "down", "down"})));
        System.out.println(Arrays.toString(streetFighterSelection(fighters, new int[] {0, 0}, new String[] {"up",
                "up", "up", "up"})));
        System.out.println(Arrays.toString(streetFighterSelection(fighters, new int[] {0, 0}, new String[] {"left",
                "left", "left", "left", "left", "left", "left", "left", "left", "left", "left"})));
        System.out.println(Arrays.toString(streetFighterSelection(fighters, new int[] {0, 0}, new String[] {"right",
                "right", "right", "right", "right", "right", "right", "right", "right", "right", "right"})));

        System.out.println(Arrays.toString(streetFighterSelection(moreFighters, new int[] {0, 0}, new String[] {"up",
                "left", "right", "left", "left"})));
        System.out.println(Arrays.toString(streetFighterSelection(moreFighters, new int[] {0, 0}, new String[] {"right",
                "down", "left", "left", "left", "left", "right"})));
        System.out.println(Arrays.toString(streetFighterSelection(moreFighters, new int[] {0, 0}, new String[] {"down",
                "down", "down", "down"})));
        System.out.println(Arrays.toString(streetFighterSelection(moreFighters, new int[] {0, 0}, new String[] {"up",
                "up", "up", "up"})));
        System.out.println(Arrays.toString(streetFighterSelection(moreFighters, new int[] {0, 0}, new String[] {"left",
                "left", "left", "left", "left", "left", "left", "left", "left", "left", "left" , "left"})));
        System.out.println(Arrays.toString(streetFighterSelection(moreFighters, new int[] {0, 0}, new String[] {"right",
                "right", "right", "right", "right", "right", "right", "right", "right", "right", "right", "right"})));
    }
}
