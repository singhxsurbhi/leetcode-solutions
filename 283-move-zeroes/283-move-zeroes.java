class Solution {
    public void moveZeroes(int[] nums) {
           int prev=0;
        for(int next=0 ; next<=nums.length-1 ; next++){
            if(nums[next]!=0){
                int temp=nums[prev];
                nums[prev]=nums[next];
                nums[next]=temp;
                prev++;
            }
        }
    }
}
