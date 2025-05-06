package medium.proverb;

// Link: https://exercism.org/tracks/java/exercises/proverb

public class Proverb {

    private String[] words;

    Proverb(String[] words) {
        this.words = words;
    }

    String recite() {
        if (words.length < 1) {
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < words.length - 1; i++) {
            stringBuilder.append("For want of a ")
                    .append(words[i])
                    .append(" the ")
                    .append(words[i+1])
                    .append(" was lost.\n");
        }
        stringBuilder.append("And all for the want of a ")
                .append(words[0])
                .append(".");
        return stringBuilder.toString();
    }
}
