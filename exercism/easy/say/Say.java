package easy.say;

// Link: https://exercism.org/tracks/java/exercises/say

// Input: 123456789L
// Output: one hundred twenty-three million four hundred fifty-six thousand seven hundred eighty-nine

public class Say {

    private static final String[] LESS_THAN_20 = {
            "zero", "one", "two", "three", "four", "five",
            "six", "seven", "eight", "nine", "ten", "eleven",
            "twelve", "thirteen", "fourteen", "fifteen", "sixteen",
            "seventeen", "eighteen", "nineteen"
    };

    private static final String[] TENS = {
            "", "", "twenty", "thirty", "forty", "fifty",
            "sixty", "seventy", "eighty", "ninety"
    };

    private static final String[] THOUSANDS = {
            "", "thousand", "million", "billion", "trillion"
    };

    public String say(long num) {
        if (num < 0 || num > 999_999_999_999L) {
            throw new IllegalArgumentException();
        }
        return convert(num).trim();
    }

    private static String convert(long num) {
        if (num == 0) {
            return "zero";
        }
        if (num < 20) {
            return LESS_THAN_20[(int) num];
        }
        if (num < 100) {
            return TENS[(int) (num / 10)] + (num % 10 != 0 ? "-" + LESS_THAN_20[(int) (num % 10)] : "");
        }
        if (num < 1000) {
            return LESS_THAN_20[(int) (num / 100)] + " hundred" + (num % 100 != 0 ? " " + convert(num % 100) : "");
        }
        for (int i = 0; i < THOUSANDS.length; i++) {
            long divisor = (long) Math.pow(1000, i + 1);
            if (num < divisor) {
                return convert(num / (divisor / 1000)) + " " + THOUSANDS[i] + (num % (divisor / 1000) != 0 ? " " + convert(num % (divisor / 1000)) : "");
            }
        }
        return "";
    }
}
