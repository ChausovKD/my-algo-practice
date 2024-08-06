package easy.remove_duplicate_from_sorted_array_26;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println(removeDuplicates2(new int[] {1, 1, 2}));
        System.out.println(removeDuplicates2(new int[] {0, 1, 1, 1, 2, 2, 3, 3, 4, 4})); // 0 1 2 3 4
    }

    public static int removeDuplicates(int[] nums) {
        int counterUniqueNumber = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i-1]) {
                nums[counterUniqueNumber] = nums[i];
                counterUniqueNumber++;
            }
        }
        System.out.println(Arrays.toString(nums));
        return counterUniqueNumber;
    }

    public static int removeDuplicates2(int[] nums) {
        int countUniqueNumber = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i-1]) {
                nums[countUniqueNumber] = nums[i];
                countUniqueNumber++;
            }
        }
        return countUniqueNumber;
    }

}
