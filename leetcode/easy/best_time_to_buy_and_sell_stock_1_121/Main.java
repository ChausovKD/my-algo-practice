package easy.best_time_to_buy_and_sell_stock_1_121;

public class Main {

    public static void main(String[] args) {
        System.out.println(maxProfit(new int[] {7, 1, 5, 3, 6, 4})); // 5
        System.out.println(maxProfit(new int[] {7,6,4,3,1})); // 0
    }

    public static int maxProfit(int[] prices) {
        int purchasePrice = Integer.MAX_VALUE;
        int bestProfit = 0;
        int currentProfit;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < purchasePrice) {
                purchasePrice = prices[i];
            }
            currentProfit = prices[i] - purchasePrice;
            if (currentProfit > bestProfit) {
                bestProfit = currentProfit;
            }
        }
        return bestProfit;
    }
}
