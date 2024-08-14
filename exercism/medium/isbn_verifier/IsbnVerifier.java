package medium.isbn_verifier;

// Link: https://exercism.org/tracks/java/exercises/isbn-verifier

public class IsbnVerifier {

    boolean isValid(String stringToVerify) {
        stringToVerify = stringToVerify.replace("-", "");
        int sum = 0;
        if (stringToVerify.length() == 10 && (Character.isDigit(stringToVerify.charAt(9)) || stringToVerify.charAt(9) == 'X')) {
            for (int i = 0, j = 10; i < 10; i++, j--) {
                char ch = stringToVerify.charAt(i);
                if (i == 9 && ch == 'X') {
                    sum += i + 1;
                    break;
                }
                else if (Character.isDigit(ch)) {
                    sum += j * Integer.parseInt(String.valueOf(ch));
                }
                else {
                    return false;
                }
            }
            return sum % 11 == 0;
        }
        return false;
    }
}
