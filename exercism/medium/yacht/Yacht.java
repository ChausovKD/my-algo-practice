package medium.yacht;

// Link: https://exercism.org/tracks/java/exercises/yacht

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Yacht {

    private final int[] dive;
    private final YachtCategory yachtCategory;

    Yacht(int[] dice, YachtCategory yachtCategory) {
        this.dive = dice;
        this.yachtCategory = yachtCategory;
    }

    int score() {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int i : dive) {
            frequencyMap.put(i, frequencyMap.getOrDefault(i, 0) + 1);
        }
        switch (yachtCategory) {
            case ONES -> {
                return frequencyMap.getOrDefault(1, 0);
            }
            case TWOS -> {
                return frequencyMap.getOrDefault(2, 0) * 2;
            }
            case THREES -> {
                return frequencyMap.getOrDefault(3, 0) * 3;
            }
            case FOURS -> {
                return frequencyMap.getOrDefault(4, 0) * 4;
            }
            case FIVES -> {
                return frequencyMap.getOrDefault(5, 0) * 5;
            }
            case SIXES -> {
                return frequencyMap.getOrDefault(6, 0) * 6;
            }
            case FULL_HOUSE -> {
                if (frequencyMap.containsValue(3) && frequencyMap.containsValue(2)) {
                    return diceSum(dive);
                }
                return 0;
            }
            case FOUR_OF_A_KIND -> {
                for (int key : frequencyMap.keySet()) {
                    if (frequencyMap.get(key) >= 4) {
                        return key * 4;
                    }
                }
                return 0;
            }
            case LITTLE_STRAIGHT -> {
                return frequencyMap.size() == 5 && !frequencyMap.containsKey(6) ? 30 : 0;
            }
            case BIG_STRAIGHT -> {
                return frequencyMap.size() == 5 && !frequencyMap.containsKey(1) ? 30 : 0;
            }
            case CHOICE -> {
                return diceSum(dive);
            }
            case YACHT -> {
                return frequencyMap.containsValue(5) ? 50 : 0;
            }
            default -> {
                return 0;
            }
        }
    }

    private int diceSum(int[] dice) {
        return Arrays.stream(dice).sum();
    }
}
