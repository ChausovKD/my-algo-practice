package medium.reverse_words_in_a_string_151;

public class Main {

    public static String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");
        int l = 0;
        int r = words.length - 1;

        while (l < r) {
            String temp = words[l];
            words[l] = words[r];
            words[r] = temp;
            l++;
            r--;
        }
        StringBuilder stringBuilder = new StringBuilder(words[0]);
        for (int i = 1; i < words.length; i++) {
            stringBuilder.append(" ").append(words[i]);
        }

        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("the sky is blue"));
        System.out.println(reverseWords("  hello world  "));
        System.out.println(reverseWords("a good   example"));
    }
}
