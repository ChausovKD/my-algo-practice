package easy.reverse_vowels_of_a_string_345;

public class Main {

    public static String reverseVowels(String s) {
        String VOWELS = "aeiouAEIOU";
        char[] chars = s.toCharArray();
        int l = 0;
        int r = s.length() - 1;

        while (l < r) {
            if (VOWELS.indexOf(chars[l]) == -1) {
                l++;
            }
            if (VOWELS.indexOf(chars[r]) == -1) {
                r--;
            }
            if (VOWELS.indexOf(chars[l]) != -1 && VOWELS.indexOf(chars[r]) != -1) {
                char temp = chars[l];
                chars[l] = chars[r];
                chars[r] = temp;
                l++;
                r--;
            }
        }
        return new String(chars);
    }

    public static void main(String[] args) {
        System.out.println(reverseVowels("hello"));
        System.out.println(reverseVowels("leetcode"));
        System.out.println(reverseVowels("a.b,."));
        System.out.println(reverseVowels("ai"));
        System.out.println(reverseVowels(" apG0i4maAs::sA0m4i0Gp0"));
        System.out.println(reverseVowels("Ui"));
    }
}
