package easy.build_array_from_permutation_1920;

// Link: https://leetcode.com/problems/build-array-from-permutation

public class Solution {

    public int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
}
