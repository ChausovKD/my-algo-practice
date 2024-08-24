package easy.concatenation_of_array_1929;

// Link: https://leetcode.com/problems/concatenation-of-array

public class Solution {

    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] doubleArr = new int[n*2];
        for (int i = 0; i < nums.length; i++) {
            doubleArr[i] = nums[i];
            doubleArr[i+n] = nums[i];
        }
        return doubleArr;
    }
}
