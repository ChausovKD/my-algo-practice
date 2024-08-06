package easy.find_the_index_of_the_first_occurrence_in_a_string_28;

public class Main {

    public static int strStr(String str, String substr) {
        int strLen = str.length();
        int substrLen = substr.length();

        if (substrLen == 0) {
            return 0;
        }

        for (int i = 0; i <= strLen - substrLen; i++) {
            for (int j = 0; j < substrLen; j++) {
                if (substr.charAt(j) != str.charAt(i + j)) {
                    break;
                }
                if (j == substrLen - 1) {
                    return i;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(strStr("sadbutsad", "sad"));
        System.out.println(strStr("leetcode", "leeto"));
    }
}
