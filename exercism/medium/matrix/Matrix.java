package medium.matrix;

// Link: https://exercism.org/tracks/java/exercises/matrix

import java.util.Arrays;

public class Matrix {

    private int[][] matrix;

    Matrix(String matrixAsString) { // second solution
        matrix = Arrays.stream(matrixAsString.split("\n"))
                .map(row -> Arrays.stream(row.split("\\s"))
                        .mapToInt(Integer::parseInt).toArray())
                .toArray(int[][]::new);
    }

    int[] getRow(int rowNumber) {
        return matrix[rowNumber - 1];
    }

    int[] getColumn(int columnNumber) {
        return Arrays.stream(matrix).mapToInt(row -> row[columnNumber - 1]).toArray();
    }


//    Matrix(String matrixAsString) { // first solution
//        String[] rows = matrixAsString.split("\n");
//        matrix = new int[rows.length][];
//        for (int i = 0; i < rows.length; i++) {
//            String[] elements = rows[i].split(" ");
//            matrix[i] = new int[elements.length];
//            for (int j = 0; j < matrix[i].length; j++) {
//                matrix[i][j] = Integer.parseInt(elements[j]);
//            }
//        }
//    }
//
//    int[] getRow(int rowNumber) {
//        int[] row = new int[matrix[rowNumber-1].length];
//        System.arraycopy(matrix[rowNumber - 1], 0, row, 0, matrix[rowNumber - 1].length);
//        return row;
//    }
//
//    int[] getColumn(int columnNumber) {
//        int[] column = new int[matrix.length];
//        for (int i = 0; i < matrix.length; i++) {
//            column[i] = matrix[i][columnNumber-1];
//        }
//        return column;
//    }
}
