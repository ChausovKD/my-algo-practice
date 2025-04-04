package easy.find_numbers_with_even_number_of_digits_1295;

/*
Асимптотическая сложность алгоритма зависит от количества элементов в массиве (nums.length) и от
количества цифр в самом большом числе в массиве (максимальное значение в nums). Мы перебираем все
элементы в массиве, а количество цифр в числах может быть определено во времени, линейно
пропорциональном логарифму от значения числа.

Таким образом, асимптотическая сложность алгоритма составляет O(n * log(max(nums))), где
n - количество элементов в массиве nums, а max(nums) - максимальное значение в массиве nums.
Если максимальное значение в массиве ограничено по величине (например, числа в массиве не превышают 10^9), то
асимптотическая сложность можно приближенно рассматривать как O(n).
 */

public class Main {
    public static int findNumbers(int[] nums) {
        int countEven = 0;
        for (int i = 0; i < nums.length; i++) {
            int countDigits = 0;
            while (nums[i] > 0) {
                nums[i] /= 10;
                countDigits++;
            }
            if ((countDigits & 1) == 0) {
                countEven++;
            }
        }
        return countEven;
    }

    public static void main(String[] args) {
        System.out.println(findNumbers(new int[] {12, 345, 2, 6, 7896}));
        System.out.println(findNumbers(new int[] {555, 901, 482, 1771}));
    }
}
