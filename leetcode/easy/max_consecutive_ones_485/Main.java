package easy.max_consecutive_ones_485;

public class Main {

    public static void main(String[] args) {
        System.out.println(findMaxConsecutiveOnes(new int[] {1,1,0,1,1,1,1,1,1,0,1,1}));
    }

    public static int findMaxConsecutiveOnes(int[] nums) {
        int counter = 0;
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                counter++;
                if (max < counter) {
                    max = counter;
                }
            } else {
                counter = 0;
            }
        }
        return max;
    }
}
