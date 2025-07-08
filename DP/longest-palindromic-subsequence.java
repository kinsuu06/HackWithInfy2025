class Solution {
    public int longestPalindromeSubseq(String s) {
        int n = s.length();
        int[][] dp = new int[n][n];
        for(int[] a : dp){
            Arrays.fill(a, -1);
        }
        return func(s, 0, n-1, dp);
    }
    public int func(String s, int i, int j, int[][] dp){
        if(i > j) return 0;
        if(i == j) return 1;
        if(dp[i][j] != -1)  return dp[i][j];
        if(s.charAt(i) == s.charAt(j)){
            dp[i][j] = 2+func(s, i+1, j-1, dp);
        }else{
            dp[i][j] = Math.max(func(s,i+1, j, dp), func(s, i, j-1, dp));
        }
        return dp[i][j];
    }
}
