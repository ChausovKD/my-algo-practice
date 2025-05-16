package medium.find_the_duplicate_number_287;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SolutionTest {

    private Solution solution;

    @BeforeEach
    public void init() {
        solution = new Solution();
    }

    @Test
    public void testFindDuplicateSingleDuplicateInMiddle() {
        assertThat(solution.findDuplicate(new int[] {1,3,4,2,2})).isEqualTo(2);
    }

    @Test
    public void testFindDuplicateSingleDuplicateAtStart() {
        assertThat(solution.findDuplicate(new int[] {3,1,3,4,2})).isEqualTo(3);
    }

    @Test
    public void testFindDuplicateAllElementsSame() {
        assertThat(solution.findDuplicate(new int[] {3,3,3,3,3})).isEqualTo(3);
    }

    @Test
    public void testFindDuplicateMultipleCloseDuplicates() {
        assertThat(solution.findDuplicate(new int[] {1,2,3,4,5,5})).isEqualTo(5);
    }

    @Test
    public void testFindDuplicateDuplicateAtEnd() {
        assertThat(solution.findDuplicate(new int[] {1,2,3,4,4})).isEqualTo(4);
    }

    @Test
    public void testFindDuplicateRandomDuplicatePosition() {
        assertThat(solution.findDuplicate(new int[] {7,3,4,6,5,9,8,2,1,4})).isEqualTo(4);
    }
}
