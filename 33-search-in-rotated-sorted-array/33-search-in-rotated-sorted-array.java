class Solution {
    public int search(int[] nums, int target) {
        if (nums[0] == target) return 0;
        int start=0;
        int end = nums.length-1;
        while(start<=end){
            int mid= start + (end-start)/2;
            
            if(nums[mid]== target) return mid;
            
            if(nums[0]>nums[mid]){
                if(nums[0]>target && nums[mid]<target){
                    start=mid+1;
                }
                else{
                    end=mid-1;
                }
            }
            else{
             if(nums[mid]>target && nums[0]<target ){
                 end=mid-1;
             }else{
                 start=mid+1;
             }
            }
        }
        return -1;
    }
}
  
 
             