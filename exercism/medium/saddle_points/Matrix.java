package medium.saddle_points;

// Link: https://exercism.org/tracks/java/exercises/saddle-points

import java.util.*;

public class Matrix {

    private final List<List<Integer>> values;

    Matrix(List<List<Integer>> values) {
        this.values = values;
    }

    Set<MatrixCoordinate> getSaddlePoints() {
        if (values.isEmpty()) {
            return new HashSet<>();
        }
        List<Integer> rowMaxes = new ArrayList<>();
        for (List<Integer> row : values) {
            int maxInRow = row.stream().mapToInt(v -> v).max().orElseThrow();
            rowMaxes.add(maxInRow);
        }

        List<Integer> colMinimums = new ArrayList<>();
        for (int col = 0; col < values.getFirst().size(); col++) {
            int currentColMin = Integer.MAX_VALUE;
            for (int row = 0; row < values.size(); row++) {
                if (values.get(row).get(col) < currentColMin) {
                    currentColMin = values.get(row).get(col);
                }
            }
            colMinimums.add(currentColMin);
        }

        Set<MatrixCoordinate> saddlePoints = new HashSet<>();
        for (int row = 0; row < values.size(); row++) {
            for (int col = 0; col < values.getFirst().size(); col++) {
                int value = values.get(row).get(col);
                if (value == rowMaxes.get(row) && value == colMinimums.get(col)) {
                    saddlePoints.add(new MatrixCoordinate(row + 1, col + 1));
                }
            }
        }
        return saddlePoints;
    }
}

//    Set<MatrixCoordinate> getSaddlePoints() {
//        return IntStream.range(0, values.size())
//                        .boxed()
//                        .flatMap(row -> IntStream.range(0, values.get(row).size())
//                                .filter(col -> Objects.equals(values.get(row).get(col), Collections.max(values.get(row)))
//                                        && values.get(row).get(col) == values.stream()
//                                                .mapToInt(value -> value.get(col))
//                                                .min()
//                                                .orElse(Integer.MAX_VALUE)
//                                        )
//                                .mapToObj(col -> new MatrixCoordinate(row + 1, col + 1)))
//                        .collect(Collectors.toSet());
//    }
