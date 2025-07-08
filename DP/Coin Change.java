class Solution {
    public int count(int coins[], int sum) {
        // code here.
        int[][] dp = new int[coins.length+1][sum+1];
        for(int[] a : dp){
            Arrays.fill(a, -1);
        }
        return func(coins, sum, 0, dp);
    }
    public static int func(int[] coins, int sum, int i, int[][] dp){
        if(sum == 0){
            return 1;
        }
        if(i >= coins.length) return 0;
        if(dp[i][sum] != -1) return dp[i][sum];
        int inc = 0;
        if(coins[i] <= sum){
            inc = func(coins, sum-coins[i],i, dp);
        }
        int exc = func(coins, sum, i+1, dp);
        return dp[i][sum] = inc+exc;
    }
}
