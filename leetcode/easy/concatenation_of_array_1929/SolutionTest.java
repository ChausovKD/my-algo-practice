package easy.concatenation_of_array_1929;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SolutionTest {

    private Solution solution;

    @BeforeEach
    public void init() {
        solution = new Solution();
    }

    @Test
    void testExample1() {
        int[] nums = {1, 2, 1};
        int[] expected = {1, 2, 1, 1, 2, 1};
        assertArrayEquals(expected, solution.getConcatenation(nums));
    }

    @Test
    void testExample2() {
        int[] nums = {1, 3, 2, 1};
        int[] expected = {1, 3, 2, 1, 1, 3, 2, 1};
        assertArrayEquals(expected, solution.getConcatenation(nums));
    }

    @Test
    void testSingleElement() {
        int[] nums = {5};
        int[] expected = {5, 5};
        assertArrayEquals(expected, solution.getConcatenation(nums));
    }

    @Test
    void testAllElementsSame() {
        int[] nums = {7, 7, 7, 7};
        int[] expected = {7, 7, 7, 7, 7, 7, 7, 7};
        assertArrayEquals(expected, solution.getConcatenation(nums));
    }

    @Test
    void testIncreasingSequence() {
        int[] nums = {1, 2, 3, 4, 5};
        int[] expected = {1, 2, 3, 4, 5, 1, 2, 3, 4, 5};
        assertArrayEquals(expected, solution.getConcatenation(nums));
    }
}
