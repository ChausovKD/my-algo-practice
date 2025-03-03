package easy.reverse_string;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ReverseStringTest {

    private ReverseString reverseString;

    @BeforeEach
    public void setup() {
        reverseString = new ReverseString();
    }

    @Test
    public void testAnEmptyString() {
        assertThat(new ReverseString().reverse("")).isEqualTo("");
    }

    @Test
    public void testSimpleWord() {
        assertThat(new ReverseString().reverse("word")).isEqualTo("drow");
    }

    @Test
    public void testAPalindrome() {
        assertThat(new ReverseString().reverse("abccba")).isEqualTo("abccba");
    }

    @Test
    public void testACollocation() {
        assertThat(reverseString.reverse("hello world")).isEqualTo("dlrow olleh");
    }
}
