package easy.can_place_flowers_605;

public class Main {

    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        for (int i = 0; i < flowerbed.length && n > 0; i++) {
            if (flowerbed[i] == 0
                    && (i == 0 || flowerbed[i-1] == 0)
                    && (i == flowerbed.length-1 || flowerbed[i+1] == 0)) {
                i++;
                n--;
            }
        }
        return n == 0;
    }

    public static void main(String[] args) {
        System.out.println(canPlaceFlowers(new int[] {1,0,0,0,1}, 1)); // true
        System.out.println(canPlaceFlowers(new int[] {1,0,0,0,1}, 2)); // false
        System.out.println(canPlaceFlowers(new int[] {1,0,0,0,0,1}, 2)); // false
        System.out.println(canPlaceFlowers(new int[] {1,0,0,0,0,0,1}, 2)); // true
        System.out.println(canPlaceFlowers(new int[] {0,0,1,0,1}, 1)); // true
    }
}
