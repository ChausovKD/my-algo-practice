package easy.difference_of_squares;

// Link: https://exercism.org/tracks/java/exercises/difference-of-squares

public class DifferenceOfSquaresCalculator {

    int computeSquareOfSumTo(int input) {
        int sum = 0;
        for (int i = 1; i <= input; i++) {
            sum += i;
        }
        return sum * sum;
    }

    int computeSumOfSquaresTo(int input) {
        int sumOfSquares = 0;
        for (int i = 1; i <= input; i++) {
            sumOfSquares += i * i;
        }
        return sumOfSquares;
    }

    int computeDifferenceOfSquares(int input) {
        return computeSquareOfSumTo(input) - computeSumOfSquaresTo(input);
    }
}
