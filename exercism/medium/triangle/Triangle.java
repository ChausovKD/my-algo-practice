package medium.triangle;

// Link: https://exercism.org/tracks/java/exercises/triangle

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class Triangle {

    // second solution
    List<Double> triangle;

    public Triangle(double a, double b, double c) throws TriangleException {
        triangle = Optional.of(Arrays.asList(a, b, c))
                .filter(legalTriangle)
                .orElseThrow(TriangleException::new);
    }

    boolean isEquilateral() {
        return triangle.stream().distinct().count() == 1;
    }

    boolean isIsosceles() {
        return triangle.stream().distinct().count() < 3;
    }

    boolean isScalene() {
        return triangle.stream().distinct().count() == 3;
    }

    private static final Predicate<List<Double>> legalTriangle = l -> {
        double sum = l.stream()
                .mapToDouble(Double::doubleValue)
                .sum();
        return l.stream()
                .allMatch(side ->
                        (sum - side > side) && (side > 0));
    };
}


    // first solution
//    private double side1;
//    private double side2;
//    private double side3;
//
//    Triangle(double side1, double side2, double side3) throws TriangleException {
//        if ((side1 <= 0 && side2 <= 0 && side3 <= 0)
//                || ((side1 + side2 < side3)
//                || (side3 + side1 < side2)
//                || (side2 + side3 < side1))) {
//            throw new TriangleException();
//        }
//        this.side1 = side1;
//        this.side2 = side2;
//        this.side3 = side3;
//    }
//
//    boolean isEquilateral() {
//        return side1 == side2 && side2 == side3;
//    }
//
//    boolean isIsosceles() {
//        return side1 == side2 || side2 == side3 || side1 == side3;
//    }
//
//    boolean isScalene() {
//        return side1 != side2 && side2 != side3 && side1 != side3;
//    }
//}
