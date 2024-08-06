package kyu7.highest_and_lowest;

/*
  Task: Highest and Lowest (7 kyu)
  URL: https://www.codewars.com/kata/554b4ac871d6813a03000035

  Description: In this little assignment you are given a string of space separated numbers, and have to return the
  highest and lowest number. All numbers are valid Int32, no need to validate them. There will always be at least one
  number in the input string. Output string must be two numbers separated by a single space, and highest number is first

  highAndLow("1 2 3 4 5")  // return "5 1"
  highAndLow("1 2 -3 4 5") // return "5 -3"
  highAndLow("1 9 3 4 -5") // return "9 -5"
*/

public class Main {
    public static void main(String[] args) {
        long time1 = System.currentTimeMillis();
        System.out.println(highAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4"));
        System.out.println(highAndLow("1 2 3 4 5"));
        System.out.println(highAndLow("1 9 3 4 -5"));
        System.out.println("time: " + (System.currentTimeMillis() - time1) + "ms");
    }

    public static String highAndLow(String numbers) {
        String[] arrNumbers = numbers.split(" ");
        int maxNumber = Integer.MIN_VALUE;
        int minNumber = Integer.MAX_VALUE;
        for (int i = 0; i < arrNumbers.length; i++) {
            int currentNumber = Integer.parseInt(arrNumbers[i]);
            if (currentNumber > maxNumber) {
                maxNumber = currentNumber;
            }
            if (currentNumber < minNumber) {
                minNumber = currentNumber;
            }
        }
        return String.format("%d %d", maxNumber, minNumber);
    }


//    public static String highAndLow(String numbers) {
//        IntSummaryStatistics statistics = Arrays.stream(numbers.split(" ")).mapToInt(Integer::parseInt).summaryStatistics();
//        return statistics.getMax() + " " + statistics.getMin();
//    }


//    public static String highAndLow(String numbers) {
//        int[] arrNumbers = Arrays.stream(numbers.split(" ")).mapToInt(Integer::parseInt).toArray();
//        Arrays.sort(arrNumbers);
//        return arrNumbers[arrNumbers.length - 1] + " " + arrNumbers[0];
//    }
}
