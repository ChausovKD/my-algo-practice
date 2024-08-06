package kyu6.two_sum;

/*
    Task:
    URL:

    Description:

    kyu_6.two_sum([1, 2, 3], 4) == {0, 2}
    kyu_6.two_sum([3, 2, 4], 6) == {1, 2}
*/

import java.util.Arrays;
import java.util.HashMap;

public class Main {

//    public static int[] twoSum(int[] numbers, int target){
//        int[] result = {};
//        for (int i = 0; i < numbers.length; i++) {
//            for(int j = 0; j < numbers.length; j++)
//                if(numbers[i] + numbers[j] == target) {
//                    result = new int[] {i, j};
//                }
//        }
//        return result;
//    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> indMap = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            Integer requiredNum = target - nums[i];
            if(indMap.containsKey(requiredNum)){
                return new int[] {indMap.get(requiredNum), i};
            }
            indMap.put(nums[i], i);
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{1,2,3}, 4)));
        System.out.println(Arrays.toString(twoSum(new int[]{3,2,4}, 6)));
        System.out.println(Arrays.toString(twoSum(new int[]{1234,5678,9012}, 14690)));
        System.out.println(Arrays.toString(twoSum(new int[]{2,2,3}, 4)));
        System.out.println(Arrays.toString(twoSum(new int[]{2,7,11,15}, 9))); // {0,1}
    }
}
