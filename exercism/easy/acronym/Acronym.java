package easy.acronym;

// Link: https://exercism.org/tracks/java/exercises/acronym

public class Acronym {

    private String phrase;

    Acronym(String phrase) {
        this.phrase = phrase;
    }

    String get() {
        StringBuilder stringBuilder = new StringBuilder();
        phrase = phrase.replaceAll("[^\\p{L}\\p{N}\\s-]", "");
        if (!phrase.isEmpty()) {
            String[] words = phrase.split("[\\s-]+");
            for (String word : words) {
                stringBuilder.append(Character.toUpperCase(word.charAt(0)));
            }
            return stringBuilder.toString();
        }
        return null;
    }
}
