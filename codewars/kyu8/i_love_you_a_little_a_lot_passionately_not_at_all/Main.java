package kyu8.i_love_you_a_little_a_lot_passionately_not_at_all;

/*
    Task: I love you, a little , a lot, passionately ... not at all (8 kyu)
    URL: https://www.codewars.com/kata/57f24e6a18e9fad8eb000296/java

    Description: Who remembers back to their time in the schoolyard, when girls would take a flower and tear its petals,
    saying each of the following phrases each time a petal was torn:
       - "I love you"
       - "a little"
       - "a lot"
       - "passionately"
       - "madly"
       - "not at all"
    If there are more than 6 petals, you start over with "I love you" for 7 petals, "a little" for 8 petals and so on.
    When the last petal was torn there were cries of excitement, dreams, surging thoughts and emotions. Your goal in
    this kata is to determine which phrase the girls would say at the last petal for a flower of a given number of
    petals. The number of petals is always greater than 0.

    Input: 1
    Output: "I love you"

    Input: 2
    Output: "a little"

    Input: 6
    Output: "not at all"
*/

public class Main {
    public static void main(String[] args) {
        System.out.println(howMuchILoveYou(1));
        System.out.println(howMuchILoveYou(2));
        System.out.println(howMuchILoveYou(6));
    }

    public static String howMuchILoveYou(int nb_petals) {
        String[] petals = {"I love you", "a little", "a lot", "passionately", "madly", "not at all"};
        return petals[(nb_petals - 1) % 6];
    }
}
