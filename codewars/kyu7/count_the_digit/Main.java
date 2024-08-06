package kyu7.count_the_digit;

/*
    Task: Count the Digit (7 kyu)
    URL: https://www.codewars.com/kata/566fc12495810954b1000030

    Description: Take an integer n (n >= 0) and a digit d (0 <= d <= 9) as an integer. Square all numbers
    k (0 <= k <= n) between 0 and n. Count the numbers of digits d used in the writing of all the k**2. Implement the
    function taking n and d as parameters and returning this count.

    Input: 10 1
    Output: 4
    Explanation: the k*k are 0, 1, 4, 9, 16, 25, 36, 49, 64, 81, 100 We are using the digit 1 in: 1, 16, 81, 100.
    The total count is then 4.

    Input: 25 1
    Output: 11
    Explanation: the k*k that contain the digit 1 are: 1, 16, 81, 100, 121, 144, 169, 196, 361, 441.
*/

public class Main {
    private static int countDigit(int k, int d) {
        int counter = 0;
        do {
            if (k % 10 == d) {
                counter++;
            }
            k /= 10;
        } while (k > 0);
        return counter;
    }

    public static int nbDig(int n, int d) {
        int count = 0;
        for (int i = 0; i <= n; i++) {
            int k = (int) Math.pow(i, 2);
            count += countDigit(k, d);
        }
        return count;
    }

//    public static int nbDig(int n, int d) {
//        int counter = 0;
//        char chD = String.valueOf(d).toCharArray()[0];
//        for (int i = 0; i <= n; i++) {
//            int k = (int) Math.pow(i, 2);
//            String strK = String.valueOf(k);
//            for (int j = 0; j < strK.length(); j++) {
//                if (strK.charAt(j) == chD) {
//                    counter++;
//                }
//            }
//        }
//        return counter;
//    }

    public static void main(String[] args) {
        System.out.println(nbDig(5750, 0));
        System.out.println(nbDig(10, 1));
        System.out.println(nbDig(25, 1));
        System.out.println(nbDig(11011, 2));
        System.out.println(nbDig(12224, 8));
        System.out.println(nbDig(11549, 1));
    }
}
