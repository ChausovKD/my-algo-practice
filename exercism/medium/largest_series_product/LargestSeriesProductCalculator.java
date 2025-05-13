package medium.largest_series_product;

// Link: https://exercism.org/tracks/java/exercises/largest-series-product

public class LargestSeriesProductCalculator {

    private String inputNumber;

    LargestSeriesProductCalculator(String inputNumber) {
        if (!inputNumber.chars().allMatch(Character::isDigit)) {
            throw new IllegalArgumentException("String to search may only contain digits.");
        }
        this.inputNumber = inputNumber;
    }

    long calculateLargestProductForSeriesLength(int numberOfDigits) {
        if (numberOfDigits == 0) {
            return 1;
        }
        else if (inputNumber.isEmpty() || inputNumber.length() < numberOfDigits) {
            throw new IllegalArgumentException("Series length must be less than or equal to the length of the string to search.");
        } else if (numberOfDigits < 0) {
            throw new IllegalArgumentException("Series length must be non-negative.");
        }
        long maxProduct = 0;
        for (int i = 0; i <= inputNumber.length() - numberOfDigits; i++) {
            String subNumber = inputNumber.substring(i, i + numberOfDigits);
            long currentProduct = subNumber.chars().mapToLong(Character::getNumericValue).reduce(1L, (a, b) -> a * b);
            if (currentProduct > maxProduct) {
                maxProduct = currentProduct;
            }
        }
        return maxProduct;
    }
}
