package easy.number_of_steps_to_reduce_a_number_to_zero_1342;

public class Main {

    public static void main(String[] args) {
        System.out.println(numberOfSteps(14));
        System.out.println(numberOfSteps(8));
        System.out.println(numberOfSteps(123));
        System.out.println(numberOfSteps(1));
    }

    public static int numberOfSteps(int num) {
        int counter = 0;
        while (num != 0) {
            if (num % 2 == 0) {
                num /= 2;
            } else {
                num -= 1;
            }
            counter++;
        }
        return counter;
    }
}
