package easy.richest_customer_wealth_1672;

public class Main {
    public static void main(String[] args) {
        System.out.println(maximumWealth(new int[][] {{1, 2 ,3}, {3, 2, 1}}));
    }
    public static int maximumWealth(int[][] accounts) {
        int max = 0;
        for (int i = 0; i < accounts.length; i++) {
            int sum = 0;
            for (int j = 0; j < accounts[0].length; j++) {
                sum += accounts[i][j];
            }
            max = Math.max(max, sum);
        }
        return max;
    }
}
