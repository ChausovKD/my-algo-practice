package easy.armstrong_numbers;

// Link: https://exercism.org/tracks/java/exercises/armstrong-numbers

public class ArmstrongNumbers {

    boolean isArmstrongNumber(int numberToCheck) {
        String str = String.valueOf(numberToCheck);
        int numberOfDigits = str.length();
        int sum = 0;
        for (int i = 0; i < numberOfDigits; i++) {
            sum += (int) Math.pow(Character.getNumericValue(str.charAt(i)), numberOfDigits);
        }
        return sum == numberToCheck;
    }
}
