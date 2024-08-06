package kyu6.delete_occurrences_of_an_element_if_it_occurs_more_than_n_times;

/*
    Task: Delete occurrences of an element if it occurs more than n times (6 kyu)
    URL: https://www.codewars.com/kata/554ca54ffa7d91b236000023

    Description: Enough is enough! Alice and Bob were on a holiday. Both of them took many pictures of the places
    they've been, and now they want to show Charlie their entire collection. However, Charlie doesn't like these
    sessions, since the motif usually repeats. He isn't fond of seeing the Eiffel tower 40 times. He tells them that he
    will only sit for the session if they show the same motif at most N times. Luckily, Alice and Bob are able to encode
    the motif as a number. Can you help them to remove numbers such that their list contains each number only up to N
    times, without changing the order?
    Given a list and a number, create a new list that contains each number of list at most N times, without reordering.
    For example if the input number is 2, and the input list is [1,2,3,1,2,1,2,3], you take [1,2,3,1,2], drop the next
    [1,2] since this would lead to 1 and 2 being in the result 3 times, and then take 3, which leads to [1,2,3,1,2,3].
    With list [20,37,20,21] and number 1, the result would be [20,37,21].

    Input: {20, 37, 20, 21}, 1
    Output: {20, 37, 21}

    Input: {1, 1, 3, 3, 7, 2, 2, 2, 2}, 3
    Output: {1, 1, 3, 3, 7, 2, 2, 2}

    Input: {1, 0, 2}, 0
    Output: {}
*/

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(deleteNth(new int[] {20, 37, 20, 21}, 1)));
        System.out.println(Arrays.toString(deleteNth(new int[] {1, 1, 3, 3, 7, 2, 2, 2, 2}, 3)));
        System.out.println(Arrays.toString(deleteNth(new int[] {1, 2, 3, 1, 1, 2, 1, 2, 3, 3, 2, 4, 5, 3, 1}, 3)));
        System.out.println(Arrays.toString(deleteNth(new int[] {}, 0)));
        System.out.println(Arrays.toString(deleteNth(new int[] {1, 0, 2}, 0)));
    }

    public static int[] deleteNth(int[] elements, int maxOccurrences) {
        Map<Integer, Integer> inputFrequencyToNumber = new HashMap<>();
        List<Integer> result = new ArrayList<>();
        if (maxOccurrences < 1) return new int[0];
        for (int item : elements) {
            boolean isContains = inputFrequencyToNumber.containsKey(item);
            if (isContains) {
                if (inputFrequencyToNumber.get(item) < maxOccurrences) {
                    inputFrequencyToNumber.put(item, inputFrequencyToNumber.get(item) + 1);
                    result.add(item);
                }
            } else {
                result.add(item);
                inputFrequencyToNumber.put(item, 1);
            }
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
