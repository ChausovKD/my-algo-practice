package medium.rotational_cipher;

// Link: https://exercism.org/tracks/java/exercises/rotational-cipher

public class RotationalCipher {

    private int shiftKey;

    RotationalCipher(int shiftKey) {
        this.shiftKey = shiftKey;
    }

    String rotate(String data) {
        StringBuilder stringBuilder = new StringBuilder();
        for (char ch : data.toCharArray()) {
            if (Character.isAlphabetic(ch)) {
                char base = Character.isLowerCase(ch) ? 'a' : 'A';
                stringBuilder.appendCodePoint((ch - base + shiftKey) % 26 + base);
            }
            else {
                stringBuilder.append(ch);
            }
        }
        return stringBuilder.toString();
    }
}
