class Solution {
    public int rob(int[] nums) {
        int[] dp = new int[nums.length+1];
        Arrays.fill(dp, -1);
       return func(nums, 0, dp); 
    }
    public int func(int[] nums, int i, int[] dp){
        if(i >= nums.length) return 0;
        if(dp[i] != -1) return dp[i];
        int rob = nums[i]+func(nums, i+2, dp);
        int dontrob = func(nums, i+1, dp);
        return dp[i] = Math.max(rob, dontrob);
    }
}
