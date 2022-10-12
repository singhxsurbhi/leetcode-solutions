class Solution {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        int i= nums.length-1;
        int maxp=0;
        while(i>=2){
            if(nums[i]<nums[i-1]+nums[i-2]){
                maxp=nums[i]+nums[i-1]+nums[i-2];
                break;
            }else i--;
        }
        return maxp;
    }
}