package medium.atbash_cipher;

// Link: https://exercism.org/tracks/java/exercises/atbash-cipher

public class Atbash {

    private static final String ALPHABET = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String REVERSE_ALPHABET = "zyxwvutsrqponmlkjihgfedcba";

    String encode(String input) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if ((stringBuilder.length() + 1) % 6 == 0 && i != input.length() - 1) {
                stringBuilder.append(" ");
            }
            if (Character.isAlphabetic(currentChar)) {
                stringBuilder.append(REVERSE_ALPHABET.charAt(ALPHABET.indexOf(currentChar) % 26));
            }
            else if (Character.isDigit(currentChar)){
                stringBuilder.append(currentChar);
            }
        }
        return stringBuilder.toString();
    }

    String decode(String input) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (Character.isAlphabetic(currentChar)) {
                stringBuilder.append(ALPHABET.charAt(REVERSE_ALPHABET.indexOf(currentChar) % 26));
            }
            else if (Character.isDigit(currentChar)){
                stringBuilder.append(currentChar);
            }
        }
        return stringBuilder.toString();
    }
}
