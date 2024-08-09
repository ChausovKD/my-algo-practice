package easy.grains;

import java.math.BigInteger;

// Link: https://exercism.org/tracks/java/exercises/grains

public class Grains {

    BigInteger grainsOnSquare(final int square) {
            if (square < 1 || square > 64) {
                throw new IllegalArgumentException("square must be between 1 and 64");
            }
            return BigInteger.TWO.pow(square - 1);
    }

    BigInteger grainsOnBoard() {
//        BigInteger sum = BigInteger.ZERO;
//        BigInteger currentCount = BigInteger.ONE;
//        for (int i = 1; i <= 64; i++) {
//            sum = sum.add(currentCount);
//            currentCount = currentCount.multiply(BigInteger.TWO);
//        }
//        return sum;

        return BigInteger.TWO.pow(64).subtract(BigInteger.ONE);
    }
}
