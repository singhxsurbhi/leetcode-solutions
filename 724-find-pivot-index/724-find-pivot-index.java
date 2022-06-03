class Solution {
    public int pivotIndex(int[] nums) {
        int sum=0, leftsum=0;
        for(int i: nums) sum += i;
        for(int j=0;j<nums.length;j++){
            if(leftsum==sum-leftsum-nums[j]) return j;
            leftsum += nums[j];
        }
        return -1;
    }
}