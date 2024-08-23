package medium.find_the_duplicate_number_287;

// Link: https://leetcode.com/problems/find-the-duplicate-number

public class Solution {

    public int findDuplicate(int[] nums) {
        int slow = nums[0];
        int fast = nums[0];

        do { // "fast" into a loop
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);
        slow = nums[0];
        while (slow != fast) { // searching for loop entry (meeting slow and fast)
            slow = nums[slow];
            fast = nums[fast];
        }
        return fast;
    }
}
