package kyu8.how_good_are_you_really;

/*
    Task: How good are you really? (8 kyu)
    URL: https://www.codewars.com/kata/5601409514fc93442500010b

    Description: There was a test in your class and you passed it. Congratulations! But you're an ambitious person. You
    want to know if you're better than the average student in your class. You receive an array with your peers' test
    scores. Now calculate the average and compare your score! Return true if you're better, else false! Your points are
    not included in the array of your class's points. Do not forget them when calculating the average score!

    Input: {2, 3}, 5
    Output: true

    Input: {100, 40, 34, 57, 29, 72, 57, 88}, 75
    Output: true

    Input: {100, 90}, 11
    Output: false
*/

public class Main {

    public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
        int sumPoints = yourPoints;
        for (int classPoint : classPoints) {
            sumPoints += classPoint;
        }
        return sumPoints / (classPoints.length + 1) <= yourPoints;
    }

    public static void main(String[] args) {
        System.out.println(betterThanAverage(new int[] {2, 3}, 5));
        System.out.println(betterThanAverage(new int[] {100, 40, 34, 57, 29, 72, 57, 88}, 75));
        System.out.println(betterThanAverage(new int[] {100, 90}, 11));
    }
}
