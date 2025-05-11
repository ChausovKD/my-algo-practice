package medium.knapsack;

public class Item {

    int weight;
    int value;

    Item(int itemWeight, int itemValue) {
        this.weight = itemWeight;
        this.value = itemValue;
    }

    @Override
    public String toString() {
        return "Item{" +
                "weight=" + weight +
                ", value=" + value +
                '}';
    }
}
