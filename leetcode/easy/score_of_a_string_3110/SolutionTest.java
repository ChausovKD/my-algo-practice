package easy.score_of_a_string_3110;

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
        String s = "hello";
        int expected = 13;
        int actual = solution.scoreOfString(s);
        assertEquals(expected, actual);
    }

    @Test
    void testExample2() {
        String s = "zaz";
        int expected = 50;
        int actual = solution.scoreOfString(s);
        assertEquals(expected, actual);
    }

    @Test
    void testEmptyString() {
        String s = "";
        int expected = 0;
        int actual = solution.scoreOfString(s);
        assertEquals(expected, actual);
    }

    @Test
    void testSingleCharacter() {
        String s = "a";
        int expected = 0;
        int actual = solution.scoreOfString(s);
        assertEquals(expected, actual);
    }

    @Test
    void testAllSameCharacters() {
        String s = "aaaaa";
        int expected = 0;
        int actual = solution.scoreOfString(s);
        assertEquals(expected, actual);
    }

    @Test
    void testAscendingOrder() {
        String s = "abc";
        int expected = 2; // |97 - 98| + |98 - 99| = 1 + 1 = 2
        int actual = solution.scoreOfString(s);
        assertEquals(expected, actual);
    }

    @Test
    void testDescendingOrder() {
        String s = "cba";
        int expected = 2; // |99 - 98| + |98 - 97| = 1 + 1 = 2
        int actual = solution.scoreOfString(s);
        assertEquals(expected, actual);
    }

    @Test
    void testMixedCaseCharacters() {
        String s = "aBcDe";
        int expected = Math.abs('a' - 'B') + Math.abs('B' - 'c') + Math.abs('c' - 'D') + Math.abs('D' - 'e');
        int actual = solution.scoreOfString(s);
        assertEquals(expected, actual);
    }
}
