package kyu7.binary_addition;

/*
  Task: Binary Addition (7 kyu)
  URL: https://www.codewars.com/kata/551f37452ff852b7bd000139

  Description: Implement a function that adds two numbers together and returns their sum in binary. The conversion can
  be done before, or after the addition. The binary number returned should be a string.

  1, 1 --> "10" (1 + 1 = 2 in decimal or 10 in binary)
  5, 9 --> "1110" (5 + 9 = 14 in decimal or 1110 in binary)
*/

public class Main {
    public static void main(String[] args) {
        long time1 = System.currentTimeMillis();
        System.out.println(binaryAddition(51, 12));
        System.out.println("time: " + (System.currentTimeMillis() - time1) + "ms");
    }

    public static String binaryAddition(int a, int b){
        return Long.toBinaryString(a + b);
    }
}

