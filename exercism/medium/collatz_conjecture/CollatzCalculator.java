package medium.collatz_conjecture;

// Link: https://exercism.org/tracks/java/exercises/collatz-conjecture

public class CollatzCalculator {

    int computeStepCount(int number) {
        if (number > 0) {
            int counter = 0;
            while (number != 1) {
                if (number % 2 == 0) {
                    number /= 2;
                }
                else {
                    number = number * 3 + 1;
                }
                counter++;
            }
            return counter;
        }
        throw new IllegalArgumentException("Only positive integers are allowed");
    }

}
