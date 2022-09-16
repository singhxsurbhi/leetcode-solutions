class Solution {
    public int maximumScore(int[] nums, int[] multipliers) {
        Integer[][] dp = new Integer[multipliers.length][multipliers.length];
        return helper(0,0,nums,multipliers,dp);
    }
    private int helper(int i,int k,int[] nums,int[] multipliers,Integer[][] dp){
        if(i >= nums.length ||  k >= multipliers.length){
            return 0;
        }
        if(dp[k][i] != null)return dp[k][i];
        int ans = 0;
        int r = nums.length-1 - (k-i);
        ans = nums[i]*multipliers[k] + helper(i+1,k+1,nums,multipliers,dp);
        
        ans = Math.max(ans,nums[r]*multipliers[k] + helper(i,k+1,nums,multipliers,dp));
        
        return dp[k][i] = ans;
    }
}