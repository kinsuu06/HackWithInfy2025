class Solution {
    int countWays(int n) {
        // your code here
        int[] dp = new int[n+1];
        Arrays.fill(dp, -1);
        return func(n, 0, dp);
        
    }
    int func(int n, int i, int[] dp){
        if(i > n) return 0;
        if(i == n) return 1;
        if(dp[i] != -1) return dp[i];
        int step1 = func(n, i+1, dp);
        int step2 = func(n, i+2, dp);
        return dp[i] = step1+step2;
    }
}
