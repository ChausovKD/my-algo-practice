package easy.find_pivot_index_724;

public class Main {

    public static int pivotIndex(int[] nums) {
        int totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }
        int leftSum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (leftSum * 2 == totalSum-nums[i]) {
                return i;
            }
            leftSum += nums[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(pivotIndex(new int[] {1, 7, 3, 6, 5, 6}));
        System.out.println(pivotIndex(new int[] {1, 2, 3}));
        System.out.println(pivotIndex(new int[] {-1,-1,-1,-1,-1,-1}));
    }
}
