package BinarySearch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String[] words = {"tocor", "torect", "tocfrrec", "tocorre", "tocorrect"};
        String S = "tocfrrec";
        System.out.println(solve(words, S));
    }

    static String solve(String[] words, String S) {
        List<String> wordList = new ArrayList<>(List.of(words));
        Collections.sort(wordList);

        int minDistance = Integer.MAX_VALUE;
        String bestWord = "";

        for (String word : wordList) {
            int distance = levenshteinDistance(S, word);
            if (distance < minDistance) {
                minDistance = distance;
                bestWord = word;
            } else if (distance == minDistance && word.compareTo(bestWord) < 0) {
                bestWord = word;
            }
        }

        return bestWord;
    }

    static int levenshteinDistance(String s, String t) {
        int n = s.length();
        int m = t.length();

        int[][] dp = new int[n + 1][m + 1];

        for (int i = 0; i <= n; i++) {
            dp[i][0] = i;
        }

        for (int j = 0; j <= m; j++) {
            dp[0][j] = j;
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (s.charAt(i - 1) == t.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else {
                    dp[i][j] = 1 + Math.min(dp[i - 1][j], Math.min(dp[i][j - 1], dp[i - 1][j - 1]));
                }
            }
        }

        return dp[n][m];
    }
}