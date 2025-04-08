package easy.squares_of_a_sorted_array_977;

import java.util.Arrays;

/*
Асимптотическая сложность данного алгоритма составляет O(n), где n - количество элементов в массиве nums.
Этот алгоритм имеет линейную сложность и зависит линейно от размера входного массива.

Алгоритм перебирает массив nums только один раз, и для каждого элемента выполняет конечное количество операций
(вычисление абсолютного значения, возведение в квадрат, присваивание). Таким образом, количество операций в цикле
пропорционально количеству элементов в массиве, и асимптотическая сложность оценивается как O(n).

 */

public class Main {

    public static int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];
        int l = 0;
        int r = nums.length - 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (Math.abs(nums[l]) > Math.abs(nums[r])) {
                result[i] = (int) Math.pow(nums[l], 2);
                l++;
            } else {
                result[i] = (int) Math.pow(nums[r], 2);
                r--;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortedSquares(new int[]{-4, -1, 0, 3, 10})));
        System.out.println(Arrays.toString(sortedSquares(new int[]{-7, -3, 2, 3, 11})));
    }
}
