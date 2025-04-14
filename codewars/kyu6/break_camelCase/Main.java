package kyu6.break_camelCase;

/*
  Task: Break camelCase (6 kyu)
  URL: https://www.codewars.com/kata/5208f99aee097e6552000148/java

  Description: Complete the solution so that the function will break up camel casing, using a space between words.

  "camelCasing"  =>  "camel Casing"
  "identifier"   =>  "identifier"
  ""             =>  ""

  Input: "camelcasingtest"
  Output: "camelcasingtest"

  Input: "camelCasingTest"
  Output: "camel Casing Test"

  Input: "test"
  Output: "test"
*/

public class Main {
    public static String camelCase(String input) {
        String[] temp = input.split("(?=[A-Z.]+)");
        String result = "";
        for(int i = 0; i < temp.length; i++){
            result += i == temp.length - 1 ? temp[i] : temp[i] + " ";
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(camelCase("camelcasingtest"));
        System.out.println(camelCase("camelCasingTest"));
        System.out.println(camelCase("test"));
    }
}
