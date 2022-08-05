class Solution {
    public int combinationSum4(int[] nums, int target) {
        int[] ans = new int[target+1];
        ans[0]=1;
        for(int i=1;i<target+1;i++){
            int curSum=i;
            for(int num:nums){
                if(curSum-num >=0){
                    ans[curSum] += ans[curSum-num];
                }
            }
        }
        return ans[target];
    }
}