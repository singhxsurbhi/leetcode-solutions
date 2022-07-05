class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length<2) return nums.length;
        Arrays.sort(nums);
        int count=1;
        int temp=1;
        for(int i=1;i<nums.length;i++){
            if (nums[i]==nums[i-1]+1){
                temp++;
                count=Math.max(temp,count);
            } 
            else if(nums[i]==nums[i-1]){
             count=Math.max(temp,count);
            } else{
                temp=1;
            }
        }
        return count;
    }
}