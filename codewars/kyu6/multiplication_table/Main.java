package kyu6.multiplication_table;

/*
    Task: Multiplication table (6 kyu)
    URL: https://www.codewars.com/kata/534d2f5b5371ecf8d2000a08

    Description: Your task, is to create N×N multiplication table, of size provided in parameter.

    when given size is 3:
        1 2 3
        2 4 6
        3 6 9
    For the given example, the return value should be:
        [[1,2,3],[2,4,6],[3,6,9]]
*/

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Arrays.stream(multiplicationTable(3)).forEach(arr -> System.out.println(Arrays.toString(arr)));
        Arrays.stream(multiplicationTable(4)).forEach(arr -> System.out.println(Arrays.toString(arr)));
        Arrays.stream(multiplicationTable(2)).forEach(arr -> System.out.println(Arrays.toString(arr)));
        Arrays.stream(multiplicationTable(1)).forEach(arr -> System.out.println(Arrays.toString(arr)));
    }

    public static int [][] multiplicationTable(int n) {
        int[][] squareMatrix = new int[n][n];
        for (int i = 1; i <= squareMatrix.length; i++) {
            for (int j = 1; j <= squareMatrix.length; j++) {
                squareMatrix[i-1][j-1] = i * j;
            }
        }
        return squareMatrix;
    }
}
