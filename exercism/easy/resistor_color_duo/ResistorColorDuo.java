package easy.resistor_color_duo;

// Link: https://exercism.org/tracks/java/exercises/resistor-color-duo

import java.util.List;

public class ResistorColorDuo {

    private static final String[] COLORS;

    static {
        COLORS = new String[] {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};
    }

    private int colorCode(String color) {
        return List.of(COLORS).indexOf(color);
    }

    int value(String[] colors) {
        return colorCode(colors[0]) * 10 + colorCode(colors[1]);
    }
}
