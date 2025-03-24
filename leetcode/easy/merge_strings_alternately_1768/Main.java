package easy.merge_strings_alternately_1768;

public class Main {

    public static String mergeAlternately(String word1, String word2) {
        StringBuilder stringBuilder = new StringBuilder();
        int i = 0;
        for (; i < word1.length() && i < word2.length(); i++) {
            stringBuilder.append(word1.charAt(i)).append(word2.charAt(i));
        }
        if (word1.length() > word2.length()) {
            stringBuilder.append(word1.substring(i));
        } else {
            stringBuilder.append(word2.substring(i));
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        System.out.println(mergeAlternately("abc", "pqr"));
        System.out.println(mergeAlternately("ab", "pqrs"));
        System.out.println(mergeAlternately("abcd", "pq"));
    }
}
