package easy.counting_bits_338;

import java.util.Arrays;

public class Main {

//    public static int[] countBits(int n) {
//        int[] ans = new int[n+1];
//        for (int i = 0; i < ans.length; i++) {
//            ans[i] = Integer.bitCount(i);
//        }
//        return ans;
//    }


    public static int[] countBits(int n) {
        int[] res = new int[n + 1];
        res[0] = 0;
        for (int x = 1; x <= n; x++) {
            res[x] = res[x / 2] + (x % 2);
        }
        return res;
    }

//    public static int[] countBits(int n) {
//        int[] ans = new int[n+1];
//        for (int i = 0; i < ans.length; i++) {
//            int sum = 0;
//            int num = i;
//
//            while (num != 0) {
//                sum += num % 2;
//                num = num / 2;
//            }
//            ans[i] = sum;
//        }
//        return ans;
//    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(countBits(2)));
        System.out.println(Arrays.toString(countBits(5)));
    }
}
