package kyu7.dont_give_me_five;

/*
    Task: Don't give me five! (7 kyu)
    URL: https://www.codewars.com/kata/5813d19765d81c592200001a

    Description: In this kata you get the start number and the end number of a region and should return the count of all
    numbers except numbers with a 5 in it. The start and the end number are both inclusive! The result may contain
    fives. The start number will always be smaller than the end number. Both numbers can be also negative!

    Input: 1 9
    Output: 8
    Explanation: 1,9 -> 1,2,3,4,6,7,8,9 -> 8

    Input: 4 17
    Output: 12
    Explanation: 4,17 -> 4,6,7,8,9,10,11,12,13,14,16,17 -> 12

    Input: 4 100
    Output: 78
*/

public class Main {

    public static int dontGiveMeFive(int start, int end) {
        int count = 0;
        for (int i = start; i <= end; i++) {
            if (String.valueOf(i).indexOf('5') == -1) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(dontGiveMeFive(1, 9));
        System.out.println(dontGiveMeFive(4, 17));
        System.out.println(dontGiveMeFive(4, 100));
    }
}
