package kyu7.breaking_chocolate_problem;

/*
    Task: Breaking chocolate problem (7 kyu)
    URL: https://www.codewars.com/kata/534ea96ebb17181947000ada

    Description: Your task is to split the chocolate bar of given dimension n x m into small squares. Each square is of
    size 1x1 and unbreakable. Implement a function that will return minimum number of breaks needed. For example if you
    are given a chocolate bar of size 2 x 1 you can split it to single squares in just one break, but for size 3 x 1 you
    must do two breaks. If input data is invalid you should return 0 (as in no breaks are needed if we do not have any
    chocolate to split). Input will always be a non-negative integer.

    Input: 5 5
    Output: 24

    Input: 2 1
    Output: 1

    Input: 3 1
    Output: 2
*/

public class Main {

    public static long breakChocolate(long n, long m) {
        return n * m - 1;
    }

    public static void main(String[] args) {
        System.out.println(breakChocolate(5, 5));
        System.out.println(breakChocolate(2, 1));
        System.out.println(breakChocolate(3, 1));
        System.out.println(breakChocolate(1, 1));
    }
}
