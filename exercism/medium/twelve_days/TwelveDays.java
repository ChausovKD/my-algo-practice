package medium.twelve_days;

// Link: https://exercism.org/tracks/java/exercises/twelve-days

import java.util.ArrayList;
import java.util.List;

public class TwelveDays {

    private static final List<String> GIFTS;
    private static final List<String> ORDINAL_NAMES;
    private static final String START_ANY_STRING = "On the ";
    private static final String WORDS_BEFORE_LISTING = " day of Christmas my true love gave to me:";

    static {
        GIFTS = new ArrayList<>();
        GIFTS.add(" a Partridge in a Pear Tree");
        GIFTS.add(" two Turtle Doves,");
        GIFTS.add(" three French Hens,");
        GIFTS.add(" four Calling Birds,");
        GIFTS.add(" five Gold Rings,");
        GIFTS.add(" six Geese-a-Laying,");
        GIFTS.add(" seven Swans-a-Swimming,");
        GIFTS.add(" eight Maids-a-Milking,");
        GIFTS.add(" nine Ladies Dancing,");
        GIFTS.add(" ten Lords-a-Leaping,");
        GIFTS.add(" eleven Pipers Piping,");
        GIFTS.add(" twelve Drummers Drumming,");

        ORDINAL_NAMES = new ArrayList<>();
        ORDINAL_NAMES.add("first");
        ORDINAL_NAMES.add("second");
        ORDINAL_NAMES.add("third");
        ORDINAL_NAMES.add("fourth");
        ORDINAL_NAMES.add("fifth");
        ORDINAL_NAMES.add("sixth");
        ORDINAL_NAMES.add("seventh");
        ORDINAL_NAMES.add("eighth");
        ORDINAL_NAMES.add("ninth");
        ORDINAL_NAMES.add("tenth");
        ORDINAL_NAMES.add("eleventh");
        ORDINAL_NAMES.add("twelfth");
    }

    String verse(int verseNumber) {
        StringBuilder stringBuilder = new StringBuilder(START_ANY_STRING);
        stringBuilder.append(ORDINAL_NAMES.get(verseNumber-1))
                .append(WORDS_BEFORE_LISTING);
        for (int i = verseNumber-1; i >= 0; i--) {
            if (i == 0 && verseNumber > 1) {
                stringBuilder.append(" and");
            }
            stringBuilder.append(GIFTS.get(i));
        }
        return stringBuilder.append(".\n").toString();
    }

    String verses(int startVerse, int endVerse) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = startVerse; i <= endVerse; i++) {
            stringBuilder.append(verse(i));
            if (i < endVerse) {
                stringBuilder.append("\n");
            }
        }
        return stringBuilder.toString();
    }

    String sing() {
        return verses(1, 12);
    }
}
