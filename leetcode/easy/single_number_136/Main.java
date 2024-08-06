package easy.single_number_136;

public class Main {

    public static int singleNumber(int[] nums) {
        int ans = 0;
        for (int i : nums) {
            ans ^= i;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(singleNumber(new int[] {2,2,1}));
        System.out.println(singleNumber(new int[] {4,1,2,1,2}));
        System.out.println(singleNumber(new int[] {1}));
    }
}
