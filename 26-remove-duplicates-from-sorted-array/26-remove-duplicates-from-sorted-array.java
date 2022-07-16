class Solution {
    public int removeDuplicates(int[] nums) {
        int previous = 0;
        
        for(int i = previous+1; i < nums.length; i++)
        {
            if(nums[i] != nums[previous])
            {
                previous++;
                nums[previous] = nums[i];
            }
        }
               
       return previous+1;
       
    }
}