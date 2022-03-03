class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        if (nums==null || nums.length<3) return 0;
        int str=0,ans=0;
        int n=nums.length;
        for(int i=2;i<n;i++){
            if(nums[i]-nums[i-1] == nums[i-1]-nums[i-2]){
                str += 1;
            ans +=str;} else str=0;
        }
        return ans;
    }
}