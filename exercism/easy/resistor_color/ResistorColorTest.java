package easy.resistor_color;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ResistorColorTest {

    private ResistorColor resistorColor;

    @BeforeEach
    public void setup() {
        resistorColor = new ResistorColor();
    }

    @Test
    public void testBlackColorCode() {
        assertThat(resistorColor.colorCode("black")).isEqualTo(0);
    }

    @Test
    public void testBlueColorCode() {
        assertThat(resistorColor.colorCode("blue")).isEqualTo(6);
    }

    @Test
    public void testGreenColorCode() {
        assertThat(resistorColor.colorCode("green")).isEqualTo(5);
    }

    @Test
    public void testWhiteColorCode() {
        assertThat(resistorColor.colorCode("white")).isEqualTo(9);
    }

    @Test
    public void testOrangeColorCode() {
        assertThat(resistorColor.colorCode("orange")).isEqualTo(3);
    }

    @Test
    public void testColors() {
        assertThat(resistorColor.colors()).containsExactly(
                "black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"
        );
    }
}
