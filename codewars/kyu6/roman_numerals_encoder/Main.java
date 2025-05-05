package kyu6.roman_numerals_encoder;

/*
  Task: Roman Numerals Encoder (6 kyu)
  URL: https://www.codewars.com/kata/51b62bf6a9c58071c600001b

  Description: Create a function taking a positive integer between 1 and 3999 (both included) as its parameter and
  returning a string containing the Roman Numeral representation of that integer. Modern Roman numerals are written by
  expressing each digit separately starting with the leftmost digit and skipping any digit with a value of zero. There
  cannot be more than 3 identical symbols in a row.
  In Roman numerals:
   - 1990 is rendered: 1000=M + 900=CM + 90=XC; resulting in MCMXC.
   - 2008 is written as 2000=MM, 8=VIII; or MMVIII.
   - 1666 uses each Roman symbol in descending order: MDCLXVI.

       1 -->       "I"
    1000 -->       "M"
    1666 --> "MDCLXVI"

  Symbol     Value
    I          1
    V          5
    X          10
    L          50
    C          100
    D          500
    M          1,000
*/

import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        long time1 = System.currentTimeMillis();
        System.out.println(solution(1));
        System.out.println(solution(4));
        System.out.println(solution(1666));
        System.out.println(solution(4000));
        System.out.println("time: " + (System.currentTimeMillis() - time1) + "ms");
    }

    public static String solution(int n) {
        LinkedHashMap<String, Integer> symbolByValue = getStringIntegerLinkedHashMap();

        StringBuilder result = new StringBuilder();


//        for(Map.Entry<Integer, String> entry: MAP.entrySet()){
//            int i = entry.getKey();
//            String s = entry.getValue();
//            while( n>=i ){
//                builder.append(s);
//                n -= i;
//            }
//        }

        for (Map.Entry<String, Integer> entry : symbolByValue.entrySet()) {
            String key = entry.getKey();
            int value = entry.getValue();
            int quantity = n / value;
            n -= quantity * value;
            result.append(key.repeat(quantity));
        }
        return result.toString();
    }

    private static LinkedHashMap<String, Integer> getStringIntegerLinkedHashMap() {
        LinkedHashMap<String, Integer> symbolByValue = new LinkedHashMap<>();
        symbolByValue.put("M", 1000);
        symbolByValue.put("CM", 900);
        symbolByValue.put("D", 500);
        symbolByValue.put("CD", 400);
        symbolByValue.put("C", 100);
        symbolByValue.put("XC", 90);
        symbolByValue.put("L", 50);
        symbolByValue.put("XL", 40);
        symbolByValue.put("X", 10);
        symbolByValue.put("IX", 9);
        symbolByValue.put("V", 5);
        symbolByValue.put("IV", 4);
        symbolByValue.put("I", 1);
        return symbolByValue;
    }
}
