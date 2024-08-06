package easy.find_the_highest_altitude_1732;

public class Main {

    public static int largestAltitude(int[] gain) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < gain.length; i++) {
            sum += gain[i];
            if (max < sum) {
                max = sum;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(largestAltitude(new int[] {-5, 1, 5, 0, -7}));
        System.out.println(largestAltitude(new int[] {-4, -3, -2, -1, 4, 3, 2}));
    }
}
