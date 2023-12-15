package arraysQues;

public class LongestPalindromicSubstring {
    public static String longestPalindrome(String input) {
        boolean[][] dp = new boolean[input.length()][input.length()];
        int max = 0;
        String res = "";
        for (int g = 0; g < input.length(); g++) {
            for (int i = 0, j = g; i < input.length() && j < input.length(); i++, j++) {
                boolean b = input.charAt(i) == input.charAt(j);
                if (g <= 1) {
                    dp[i][j] = b;
                } else dp[i][j] = b && dp[i + 1][j - 1];
                if (dp[i][j] && g+1>max){
                    max = g+1;
                    res = input.substring(i,j+1);
                }
            }
        }
        return res;
    }
}
