class Solution {
    public int minCut(String s) {
        int n = s.length();
        boolean[][] dp = new boolean[n][n];
        int[] cuts = new int[n];

        for (int i = n - 1; i >= 0; i--) {
            cuts[i] = n - i - 1;

            for (int j = i; j < n; j++) {
                if (s.charAt(i) == s.charAt(j) &&
                    (j - i <= 2 || dp[i + 1][j - 1])) {

                    dp[i][j] = true;

                    if (j == n - 1) {
                        cuts[i] = 0;
                    } else {
                        cuts[i] = Math.min(cuts[i], 1 + cuts[j + 1]);
                    }
                }
            }
        }

        return cuts[0];
    }
}
