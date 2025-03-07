package easy.resistor_color;

import java.util.List;

public class ResistorColor {

    private static final String[] COLORS;

    static {
        COLORS = new String[] {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};
    }

    int colorCode(String color) {
        return List.of(COLORS).indexOf(color);
    }

    String[] colors() {
        return COLORS;
    }
}
