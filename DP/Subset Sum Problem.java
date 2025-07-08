class Solution {
    static Boolean isSubsetSum(int arr[], int sum) {
        int n = arr.length;
        Boolean[][] dp = new Boolean[n + 1][sum + 1]; 
        return func(arr, sum, 0, dp);
    }

    public static boolean func(int[] arr, int target, int i, Boolean[][] dp) {
        if (target == 0) return true;
        if (i >= arr.length) return false;

        if (dp[i][target] != null) return dp[i][target];

        boolean inc = false;
        if (arr[i] <= target) {
            inc = func(arr, target - arr[i], i + 1, dp);
        }

        boolean exc = func(arr, target, i + 1, dp);

        return dp[i][target] = inc || exc;
    }
}
