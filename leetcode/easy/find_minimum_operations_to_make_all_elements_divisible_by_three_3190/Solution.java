package easy.find_minimum_operations_to_make_all_elements_divisible_by_three_3190;

// Link: https://leetcode.com/problems/find-minimum-operations-to-make-all-elements-divisible-by-three

public class Solution {

    public int minimumOperations(int[] nums) {
        int counter = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 3 != 0) {
                counter++;
            }
        }
        return counter;
    }
}
