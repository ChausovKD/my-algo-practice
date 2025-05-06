package medium.nth_prime;

// Link: https://exercism.org/tracks/java/exercises/nth-prime

public class PrimeCalculator {

    private boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        if (number == 2) {
            return true;
        }
        if (number % 2 == 0) { // 2 is the only even prime number.
            return false;
        }
        for (int i = 3; i * i <= number; i += 2) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    int nth(int nth) {
        if (nth < 1) {
            throw new IllegalArgumentException();
        }
        int counter = 0;
        int number = 1;
        while (counter < nth) {
            number++;
            if (isPrime(number)) {
                counter++;
            }
        }
        return number;
    }
}
