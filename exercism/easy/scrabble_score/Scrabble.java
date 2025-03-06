package easy.scrabble_score;

// Link: https://exercism.org/tracks/java/exercises/scrabble-score

import java.util.HashMap;
import java.util.Map;

public class Scrabble {

    private String word;
    private static final Map<Integer, Integer> LETTER_TO_POINTS;

    static {
        LETTER_TO_POINTS = new HashMap<>();
        "aeioulnrst".chars().forEach(ch -> LETTER_TO_POINTS.put(ch, 1));
        "dg".chars().forEach(ch -> LETTER_TO_POINTS.put(ch, 2));
        "bcmp".chars().forEach(ch -> LETTER_TO_POINTS.put(ch, 3));
        "fhvwy".chars().forEach(ch -> LETTER_TO_POINTS.put(ch, 4));
        "k".chars().forEach(ch -> LETTER_TO_POINTS.put(ch, 5));
        "jx".chars().forEach(ch -> LETTER_TO_POINTS.put(ch, 8));
        "qz".chars().forEach(ch -> LETTER_TO_POINTS.put(ch, 10));
    }

    Scrabble(String word) {
        this.word = word.toLowerCase();
    }

    int getScore() {
        return word.chars().reduce(0, (a, b) -> a + LETTER_TO_POINTS.get(b));
    }
}
