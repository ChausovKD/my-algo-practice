package medium.luhn;

// Link: https://exercism.org/tracks/java/exercises/luhn

public class LuhnValidator {

    boolean isValid(String candidate) { // second solution
        candidate = candidate.replace(" ", "");
        if (candidate.length() <= 1 || !candidate.chars().allMatch(Character::isDigit)) {
            return false;
        }
        StringBuilder stringBuilder = new StringBuilder(candidate);
        for (int i = stringBuilder.length()-2; i >= 0; i -= 2) {
            int newDigit = Character.getNumericValue(stringBuilder.charAt(i)) * 2;
            stringBuilder.setCharAt(i,  Character.forDigit(newDigit > 9 ? newDigit - 9 : newDigit, 10));
        }
        return stringBuilder.toString().chars().map(Character::getNumericValue).sum() % 10 == 0;
    }

//    boolean isValid(String candidate) { // first solution
//        candidate = candidate.replace(" ", "");
//        StringBuilder stringBuilder = new StringBuilder(candidate).reverse();
//        candidate = stringBuilder.toString();
//        if (candidate.length() <= 1 || !candidate.chars().allMatch(Character::isDigit)) {
//            return false;
//        }
//        int sum = 0;
//        for (int i = 0; i < candidate.length(); i++) {
//            int currentNumber = Character.getNumericValue(candidate.charAt(i));
//            if ((i+1) % 2 == 0) {
//                int newDigit = currentNumber * 2;
//                sum += newDigit > 9 ? newDigit - 9 : newDigit;
//            }
//            else {
//                sum += currentNumber;
//            }
//        }
//        return sum % 10 == 0;
//    }
}
