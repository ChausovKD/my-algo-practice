package easy.resistor_color_trio;

// Link: https://exercism.org/tracks/java/exercises/resistor-color-trio

import java.util.List;

public class ResistorColorTrio {

    private static final String[] COLORS;

    static {
        COLORS = new String[] {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};
    }

    private int colorCode(String color) {
        return List.of(COLORS).indexOf(color);
    }

    private int value(String[] colors) {
        return colorCode(colors[0]) * 10 + colorCode(colors[1]);
    }

    String label(String[] colors) {
        int value = value(colors);
        int numberOfZeros = colorCode(colors[2]) + (colors[1].equals("black") ? 1 : 0);
        if (colors[1].equals("black")) {
            value /= 10;
        }
        if (numberOfZeros % 3 > 0) {
            value *= 10;
        }
        if (numberOfZeros >= 3 && numberOfZeros < 6) {
            return value + " kiloohms";
        }
        else if (numberOfZeros >= 6 && numberOfZeros < 9) {
            return value + " megaohms";
        }
        else if (numberOfZeros >= 9 && numberOfZeros < 12) {
            return value + " gigaohms";
        }
        return value + " ohms";
    }
}
