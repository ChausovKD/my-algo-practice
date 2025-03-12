package easy.two_fer;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TwoferTest {

    private Twofer twofer;

    @BeforeEach
    public void setup() {
        twofer = new Twofer();
    }

    @Test
    public void testWithName() {
        assertThat(twofer.twofer("Alice")).isEqualTo("One for Alice, one for me.");
    }

    @Test
    public void testWithoutName() {
        assertThat(twofer.twofer("")).isEqualTo("One for you, one for me.");
    }

    @Test
    public void testWithNull() {
        assertThat(twofer.twofer(null)).isEqualTo("One for you, one for me.");
    }

    @Test
    public void testWithEmptyString() {
        assertThat(twofer.twofer("")).isEqualTo("One for you, one for me.");
    }
}
