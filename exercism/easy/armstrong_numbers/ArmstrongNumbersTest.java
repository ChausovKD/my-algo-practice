package easy.armstrong_numbers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ArmstrongNumbersTest {

    public ArmstrongNumbers armstrongNumbers;

    @BeforeEach
    public void setup() {
        armstrongNumbers = new ArmstrongNumbers();
    }

    @Test
    public void testIsArmstrongNumber() {
        assertThat(armstrongNumbers.isArmstrongNumber(9)).isTrue();
    }

    @Test
    public void testIsNotArmstrongNumber() {
        assertThat(armstrongNumbers.isArmstrongNumber(10)).isFalse();
    }

    @Test
    public void testIsOtherArmstrongNumber() {
        assertThat(armstrongNumbers.isArmstrongNumber(153)).isTrue();
    }

    @Test
    public void testIsOtherNotArmstrongNumber() {
        assertThat(armstrongNumbers.isArmstrongNumber(154)).isFalse();
    }
}
