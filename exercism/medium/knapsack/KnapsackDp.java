package medium.knapsack;

// Link: https://exercism.org/tracks/java/exercises/knapsack

import java.util.List;

public class KnapsackDp {

    int maximumValue(int maximumWeight, List<Item> items) {
        int n = items.size();
        int[][] dpMaxValues = new int[n+1][maximumWeight+1];
        for (int i = 1; i <= n; i++) {
            Item item = items.get(i - 1);
            for (int weightIterator = 0; weightIterator <= maximumWeight; weightIterator++) {
                // will the item fit at this step of the weight iterator and is there any free space left at this step
                if (item.weight <= weightIterator) {
                    // we take the "value" from the cell, which is the state before adding a new object (the total value
                    // of the elements whose weight before adding a new object will be equal to
                    // weightIterator - weightCurrentItem), add the value of the newest object to it, because we have
                    // free space for it (weightCurrentItem <= weightIterator), at this iterator step.
                    int tempMaxValueWithItem = dpMaxValues[i-1][weightIterator-item.weight] + item.value;
                    int tempMaxValueWithoutItem = dpMaxValues[i-1][weightIterator];
                    if (tempMaxValueWithoutItem > tempMaxValueWithItem) {
                        dpMaxValues[i][weightIterator] = tempMaxValueWithoutItem;
                    }
                    else {
                        dpMaxValues[i][weightIterator] = tempMaxValueWithItem;
                    }
                }
                else {
                    // If the item does not fit into the backpack at this step, copy the maximum value without this item
                    dpMaxValues[i][weightIterator] = dpMaxValues[i-1][weightIterator];
                }
            }
        }
        return dpMaxValues[n][maximumWeight];
    }
}
