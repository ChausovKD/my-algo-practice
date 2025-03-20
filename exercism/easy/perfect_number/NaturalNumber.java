package easy.perfect_number;

// Link: https://exercism.org/tracks/java/exercises/perfect-numbers

import java.util.ArrayList;
import java.util.List;

public class NaturalNumber {

    private int number;

    NaturalNumber(int number) {
        if (number <= 0) {
            throw new IllegalArgumentException("You must supply a natural number (positive integer)");
        }
        this.number = number;
    }

    Classification getClassification() {
        int aliquotSum = 0;
        for (int i : findFactors(number)) {
            aliquotSum += i;
        }
        aliquotSum -= number;
        if (number < aliquotSum) {
            return Classification.ABUNDANT;
        }
        else if (number > aliquotSum) {
            return Classification.DEFICIENT;
        }
        return Classification.PERFECT;
    }

    private List<Integer> findFactors(int number) {
        List<Integer> factors = new ArrayList<>();
        for(int i = 1; i <= Math.sqrt(number); i++) {
            if(number % i == 0) {
                factors.add(i); // multipliers are different
                if (i != number / i) { // the multipliers are the same
                    factors.add(number / i);
                }
            }
        }
        return factors;
    }
}
