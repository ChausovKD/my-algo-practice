package easy.move_zeroes_283;

import java.util.Arrays;

public class Main {

    public static void moveZeroes(int[] nums) {
        int counterZ = 0;
        for (int i = 0, r = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[r + counterZ] = 0;
                nums[r++] = temp;
            }
            else {
                counterZ++;
            }
        }
        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {
        moveZeroes(new int[] {0,1,0,3,12});
        moveZeroes(new int[] {0});
        moveZeroes(new int[] {1, 0});
    }
}
