package kyu7.maximum_length_difference;

/*
    Task: Maximum Length Difference (7 kyu)
    URL: https://www.codewars.com/kata/5663f5305102699bad000056/java

    Description: You are given two arrays a1 and a2 of strings. Each string is composed with letters from a to z. Let x
    be any string in the first array and y be any string in the second array. Find max(abs(length(x) − length(y))) If a1
    and/or a2 are empty return -1 in each language except in Haskell (F#) where you will return Nothing (None).

    Input: {"hoqq", "bbllkw", "oox", "ejjuyyy", "plmiis", "xxxzgpsssa", "xxwwkktt", "znnnnfqknaz", "qqquuhii", "dvvvwz"}
     {"cccooommaaqqoxii", "gggqaffhhh", "tttoowwwmmww"}
    Output: 13

    Input: {"ejjjjmmtthh", "zxxuueeg", "aanlljrrrxx", "dqqqaaabbb", "oocccffuucccjjjkkkjyyyeehh"} {"bbbaaayddqbbrrrv"}
    Output: 10
*/

class MaxDiffLength {

    public static int mxdiflg(String[] a1, String[] a2) {
        if (a1.length == 0 || a2.length == 0) {
            return -1;
        }

        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
        int max1 = 0, max2 = 0;

        for (String x : a1) {
            min1 = Math.min(min1, x.length());
            max1 = Math.max(max1, x.length());
        }

        for (String y : a2) {
            min2 = Math.min(min2, y.length());
            max2 = Math.max(max2, y.length());
        }

        return Math.max(Math.abs(min1 - max2), Math.abs(max1 - min2));
    }
}

public class Main {
    public static void main(String[] args) {
        String[] s1 = new String[]{"hoqq", "bbllkw", "oox", "ejjuyyy", "plmiis", "xxxzgpsssa", "xxwwkktt", "znnnnfqknaz"
                , "qqquuhii", "dvvvwz"};
        String[] s2 = new String[]{"cccooommaaqqoxii", "gggqaffhhh", "tttoowwwmmww"};
        System.out.println(MaxDiffLength.mxdiflg(s1, s2));

        s1 = new String[0];
        s2 = new String[0];
        System.out.println(MaxDiffLength.mxdiflg(s1, s2));
    }
}
