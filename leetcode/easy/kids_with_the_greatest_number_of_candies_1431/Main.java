package easy.kids_with_the_greatest_number_of_candies_1431;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] > max) {
                max = candies[i];
            }
        }
        List<Boolean> result = new ArrayList<>();
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] + extraCandies >= max) {
                result.add(true);
            } else {
                result.add(false);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(kidsWithCandies(new int[] {4,2,1,1,2}, 1));
        System.out.println(kidsWithCandies(new int[] {12,1,12}, 10));
        System.out.println(kidsWithCandies(new int[] {2,3,5,1,3}, 3));
    }
}
