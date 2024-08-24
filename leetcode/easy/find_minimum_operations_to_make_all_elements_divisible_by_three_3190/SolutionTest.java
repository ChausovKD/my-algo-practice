package easy.find_minimum_operations_to_make_all_elements_divisible_by_three_3190;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    private Solution solution;

    @BeforeEach
    public void init() {
        solution = new Solution();
    }

    @Test
    void testExample1() {
        int[] nums = {1, 2, 3, 4};
        assertEquals(3, solution.minimumOperations(nums));
    }

    @Test
    void testExample2() {
        int[] nums = {3, 6, 9};
        assertEquals(0, solution.minimumOperations(nums));
    }

    @Test
    void testSingleElement() {
        int[] nums = {9};
        assertEquals(0, solution.minimumOperations(nums));
    }

    @Test
    void testAllElementsWithSameRemainder() {
        int[] nums = {2, 5, 8};
        assertEquals(3, solution.minimumOperations(nums));
    }

    @Test
    void testAllElementsWithDifferentRemainders() {
        int[] nums = {1, 2, 4, 5};
        assertEquals(4, solution.minimumOperations(nums));
    }

    @Test
    void testLargeArray() {
        int[] nums = {1, 2, 4, 5, 7, 8, 10, 11};
        assertEquals(8, solution.minimumOperations(nums));
    }
}
