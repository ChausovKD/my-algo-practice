package kyu7.mumbling;

/*
    Task: Mumbling (7 kyu)
    URL: https://www.codewars.com/kata/5667e8f4e3f572a8f2000039

    Description: This time no story, no theory. The examples below show you how to write function accum:

    accum("abcd") -> "A-Bb-Ccc-Dddd"
    accum("RqaEzty") -> "R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy"
    accum("cwAt") -> "C-Ww-Aaa-Tttt"
    The parameter of accum is a string which includes only letters from a..z and A..Z.
*/

public class Main {
    public static void main(String[] args) {
        System.out.println(accum("ZpglnRxqenU"));
        System.out.println(accum("NyffsGeyylB"));
        System.out.println(accum("MjtkuBovqrU"));
        System.out.println(accum("EvidjUnokmM"));
        System.out.println(accum("HbideVbxncC"));
    }

    public static String accum(String s) {
        s = s.toLowerCase();
        StringBuilder result = new StringBuilder();
        for (int i = 1; i <= s.length(); i++) {
            result.append(s.substring(i-1, i).toUpperCase()).append(s.substring(i-1, i).repeat(i-1)).append("-");
        }
        result.deleteCharAt(result.length()-1);
        return result.toString();
    }
}
