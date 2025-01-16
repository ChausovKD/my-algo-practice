package kyu8.is_he_gonna_survive;

/*
    Task: Is he gonna survive? (8 kyu)
    URL: https://www.codewars.com/kata/59ca8246d751df55cc00014c

    Description: A hero is on his way to the castle to complete his mission. However, he's been told that the castle is
    surrounded with a couple of powerful dragons! each dragon takes 2 bullets to be defeated, our hero has no idea how
    many bullets he should carry. Assuming he's going to grab a specific given number of bullets and move forward to
    fight another specific given number of dragons, will he survive? Return true if yes, false otherwise.

    Input: 10 5
    Output: true

    Input: 100 40
    Output: true
*/

public class Main {

    public static boolean hero(int bullets, int dragons) {
        return bullets / 2 >= dragons;
    }

    public static void main(String[] args) {
        System.out.println(hero(10, 5));
        System.out.println(hero(100, 40));
    }
}
