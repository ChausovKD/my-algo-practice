package medium.isogram;

// Link: https://exercism.org/tracks/java/exercises/isogram

import java.util.Set;
import java.util.stream.Collectors;

public class IsogramChecker {

    boolean isIsogram(String phrase) { // second solution
        phrase = phrase.replaceAll("[^A-Za-z]+", "").toLowerCase();
        return phrase.chars().distinct().count() == phrase.length();
    }

//    boolean isIsogram(String phrase) { // first solution
//        phrase = phrase.replaceAll("[^A-Za-z]+", "").toLowerCase();
//        Set<Character> stringCharacters = phrase.chars().mapToObj(c -> (char) c).collect(Collectors.toSet());
//        return stringCharacters.size() == phrase.length();
//    }
}
