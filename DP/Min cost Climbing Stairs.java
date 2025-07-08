//Back-end complete function Template for Java

class Solution {
    static int minCostClimbingStairs(int[] cost) {
        // Write your code here
        int n = cost.length;
        int[] dp = new int[n+1];
        Arrays.fill(dp, -1);
        int step1 = func(cost, 0, dp);
        int step2 = func(cost, 1, dp);
        return Math.min(step1, step2);
    }
    static int func(int[] cost, int i, int[] dp){
        if(i >= cost.length) return 0;
        if(dp[i] != -1) return dp[i];
        int step1 = func(cost, i+1, dp);
        int step2 = func(cost, i+2, dp);
        return dp[i] = cost[i]+Math.min(step1, step2);
    }
};
