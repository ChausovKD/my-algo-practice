package kyu7.credit_card_mask;

/*
  Task: Credit Card Mask (7 kyu)
  URL: https://www.codewars.com/kata/5412509bd436bd33920011bc

  Description: Usually when you buy something, you're asked whether your credit card number, phone number or answer to
  your most secret question is still correct. However, since someone could look over your shoulder, you don't want that
  shown on your screen. Instead, we mask it. Your task is to write a function maskify, which changes all but the last
  four characters into '#'.
                               "64607935616" --> "#######5616"
                                         "1" --> "1"
                                          "" --> ""
                                    "Skippy" --> "##ippy"
  "Nananananananananananananananana Batman!" --> "####################################man!"
*/

public class Main {
    public static void main(String[] args) {
        System.out.println(maskify("4556364607935616"));
        System.out.println(maskify("64607935616"));
        System.out.println(maskify("1"));
        System.out.println(maskify(""));
        System.out.println(maskify("Nananananananananananananananana Batman!"));
    }

    public static String maskify(String str) {
        if (str.length() >=4) {
            int countRepeat = str.length() - 4;
            return "#".repeat(countRepeat) +
                    str.substring(str.length() - 4, str.length());
        } else {
            return str;
        }
    }
}
