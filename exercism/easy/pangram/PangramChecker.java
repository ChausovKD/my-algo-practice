package easy.pangram;

// Link: https://exercism.org/tracks/java/exercises/pangram

import java.util.HashSet;
import java.util.Set;

public class PangramChecker {

    private static final Set<Character> ENGLISH_ALPHABET;

    static {
        ENGLISH_ALPHABET = new HashSet<>();
        for (char ch = 'a'; ch <= 'z'; ch++) {
            ENGLISH_ALPHABET.add(ch);
        }
    }

    public boolean isPangram(String input) {
        if (input.length() < 26) {
            return false;
        }
        Set<Character> enteredCharacters = new HashSet<>();
        for (char ch : input.toCharArray()) {
            enteredCharacters.add(Character.toLowerCase(ch));
        }
        return enteredCharacters.containsAll(ENGLISH_ALPHABET);
    }
}
