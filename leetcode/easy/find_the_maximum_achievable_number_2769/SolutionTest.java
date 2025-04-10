package easy.find_the_maximum_achievable_number_2769;

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
        int num = 4;
        int t = 1;
        int expected = 6;
        assertEquals(expected, solution.theMaximumAchievableX(num, t));
    }

    @Test
    void testExample2() {
        int num = 3;
        int t = 2;
        int expected = 7;
        assertEquals(expected, solution.theMaximumAchievableX(num, t));
    }

    @Test
    void testMinimumValues() {
        int num = 1;
        int t = 1;
        int expected = 3;
        assertEquals(expected, solution.theMaximumAchievableX(num, t));
    }

    @Test
    void testMaximumValues() {

        int num = 50;
        int t = 50;
        int expected = 150;
        assertEquals(expected, solution.theMaximumAchievableX(num, t));
    }

    @Test
    void testZeroOperations() {
        int num = 10;
        int t = 0;
        int expected = 10;
        assertEquals(expected, solution.theMaximumAchievableX(num, t));
    }
}
