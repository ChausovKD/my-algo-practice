package easy.score_of_a_string_3110;

// Link: https://leetcode.com/problems/score-of-a-string/description

public class Solution {

    public int scoreOfString(String s) {
        int score = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            score += Math.abs(s.charAt(i) - s.charAt(i+1));
        }
        return score;
    }
}
