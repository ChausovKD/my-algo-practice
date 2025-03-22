package easy.high_scores;

// Link: https://exercism.org/tracks/java/exercises/high-scores

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class HighScores {

    private final List<Integer> highScores;

    public HighScores(List<Integer> highScores) {
        this.highScores = highScores;
    }

    List<Integer> scores() {
        return highScores;
    }

    Integer latest() {
        return highScores.getLast();
    }

    Integer personalBest() {
        return Collections.max(highScores);
    }

    List<Integer> personalTopThree() {
        return highScores.stream().sorted(Comparator.reverseOrder()).limit(3).collect(Collectors.toList());
    }
}
