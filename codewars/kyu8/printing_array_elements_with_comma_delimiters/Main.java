package kyu8.printing_array_elements_with_comma_delimiters;

/*
    Task: Printing Array elements with Comma delimiters (8 kyu)
    URL: https://www.codewars.com/kata/56e2f59fb2ed128081001328

    Description: Input - Array of elements Output - String with comma delimited elements of the array in th same order.
    If this seems too simple for you try the next level. The input data can be: boolean array, array of objects, array
    of string arrays, array of number arrays...

    Input: {2,4,5,2}
    Output: "2,4,5,2"

    Input: {"h","o","l","a"}
    Output: "h,o,l,a"
*/

public class Main {
    public static <T> String printArray(T[] array) {
        StringBuilder result = new StringBuilder();
        result.append(array[0]);
        int i = 1;
        while (i < array.length) {
            result.append(",").append(array[i++]);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(printArray(new Integer[]{2,4,5,2}));
        System.out.println(printArray(new String[]{"h","o","l","a"}));
    }
}
