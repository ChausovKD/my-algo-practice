package kyu7.form_the_minimum;

/*
    Task: Form The Minimum
    URL: https://www.codewars.com/kata/5ac6932b2f317b96980000ca

    Description: Given a list of digits, return the smallest number that could be formed from these digits, using the
    digits only once (ignore duplicates). Only positive integers will be passed to the function (> 0 ), no negatives or
    zeros.

    Input: {1, 3, 1}
    Output: 13
    Explanation: 13 is the minimum number could be formed from {1, 3, 1}, without duplications

    Input: {5, 7, 5, 9, 7}
    Output: 579
    Explanation: 579 is the minimum number could be formed from {5, 7, 5, 9, 7}, without duplications
*/

import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {
    public static int minValue(int[] values){
//        Integer[] integerNumbers = Arrays.stream(values).boxed().toArray(Integer[]::new);
//        TreeSet<Integer> sortedSet = new TreeSet<>(Arrays.asList(integerNumbers));
//        StringBuilder stringBuilder = new StringBuilder();
//        for (Integer item : sortedSet) {
//            stringBuilder.append(item);
//        }
//        return Integer.parseInt(stringBuilder.toString());


        String s = Arrays.stream(values)
                .sorted()
                .distinct()
                .mapToObj(Integer::toString)
                .collect(Collectors.joining(""));
        return Integer.parseInt(s);
    }

    public static void main(String[] args) {
        System.out.println(minValue(new int[] {1, 3, 1}));
        System.out.println(minValue(new int[] {4, 7, 5, 7}));
        System.out.println(minValue(new int[] {6, 7, 8, 7, 6, 6}));
        System.out.println(minValue(new int[] {5, 7, 5, 9, 7}));
    }
}
