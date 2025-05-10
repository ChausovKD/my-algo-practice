package medium.bob;

// Link: https://exercism.org/tracks/java/exercises/bob

public class Bob {

    String hey(String input) {
        input = input.trim();
        if (input.isEmpty()) {
            return "Fine. Be that way!";
        }
        if (isYelling(input) && input.endsWith("?")) {
            return "Calm down, I know what I'm doing!";
        }
        if (isYelling(input)) {
            return "Whoa, chill out!";
        }
        if (input.endsWith("?")) {
            return "Sure.";
        }
        return "Whatever.";
    }

    private boolean isYelling(String input) {
        return input.chars().anyMatch(Character::isLetter) && input.equals(input.toUpperCase());
    }
}
