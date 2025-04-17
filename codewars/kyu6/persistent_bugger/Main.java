package kyu6.persistent_bugger;

/*
  Task: Persistent Bugger. (6 kyu)
  URL: https://www.codewars.com/kata/55bf01e5a717a0d57e0000ec

  Description: Write a function, persistence, that takes in a positive parameter num and returns its multiplicative
  persistence, which is the number of times you must multiply the digits in num until you reach a single digit.

  39 --> 3 (because 3*9 = 27, 2*7 = 14, 1*4 = 4 and 4 has only one digit, there are 3 multiplications)
  999 --> 4 (because 9*9*9 = 729, 7*2*9 = 126, 1*2*6 = 12, and finally 1*2 = 2, there are 4 multiplications)
  4 --> 0 (because 4 is already a one-digit number, there is no multiplication)
*/

public class Main {

    public static int persistence(long n) {
        int result = 0;
        long productOfNumbers = n;
        char[] temp = String.valueOf(n).toCharArray();
        while (productOfNumbers / 10 != 0 && n / 10 > 1){
            result += 1;
            productOfNumbers = 1;
            for(char item : temp) {
                productOfNumbers *= Integer.parseInt(String.valueOf(item));
                temp = String.valueOf(productOfNumbers).toCharArray();
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(persistence(39));
        System.out.println(persistence(999));
        System.out.println(persistence(4));
    }
}
