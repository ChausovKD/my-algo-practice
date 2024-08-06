package easy.contains_duplicate_217;

import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
        System.out.println(containsDuplicate(new int[] {1,2,3,1}));
        System.out.println(containsDuplicate(new int[] {1,2,3,4}));
        System.out.println(containsDuplicate(new int[] {1,1,1,3,3,4,3,2,4,2}));
    }

    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num: nums) {
            if (set.contains(num)) {
                return true;
            }
            set.add(num);
        }
        return false;
    }

//    public static boolean containsDuplicate(int[] nums) {
//        HashMap<Integer, Integer> occurrenceFrequency = new HashMap<>();
//        for (int num : nums) {
//            if (occurrenceFrequency.containsKey(num)) {
//                return true;
//            }
//            occurrenceFrequency.put(num, occurrenceFrequency.getOrDefault(num, 0));
//        }
//        return false;
//    }
}
