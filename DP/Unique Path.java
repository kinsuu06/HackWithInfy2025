class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m+1][n+1];
        for(int[] a : dp){
            Arrays.fill(a, -1);
        }
        return func(m, n, 0, 0, dp);
    }
    public int func(int m, int n, int i, int j, int[][] dp){
        if(i >= m || j >= n) return 0;
        if(i == m-1 && j == n-1) return 1;
        if(dp[i][j] != -1) return dp[i][j]; 
        int r = func(m, n, i, j+1, dp);
        int d = func(m, n, i+1, j, dp);
        return dp[i][j] = r+d;
    }
}
