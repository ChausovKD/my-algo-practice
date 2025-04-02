package easy.build_array_from_permutation_1920;

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
        int[] nums = {0, 2, 1, 5, 3, 4};
        int[] expected = {0, 1, 2, 4, 5, 3};
        assertArrayEquals(expected, solution.buildArray(nums));
    }

    @Test
    void testExample2() {
        int[] nums = {5, 0, 1, 2, 3, 4};
        int[] expected = {4, 5, 0, 1, 2, 3};
        assertArrayEquals(expected, solution.buildArray(nums));
    }

    @Test
    void testSingleElement() {
        int[] nums = {0};
        int[] expected = {0};
        assertArrayEquals(expected, solution.buildArray(nums));
    }

    @Test
    void testConsecutiveNumbers() {
        int[] nums = {1, 0};
        int[] expected = {0, 1};
        assertArrayEquals(expected, solution.buildArray(nums));
    }

    @Test
    void testPermutationOfThree() {
        int[] nums = {2, 0, 1};
        int[] expected = {1, 2, 0};
        assertArrayEquals(expected, solution.buildArray(nums));
    }
}
