class Solution {
    public int findMin(int[] nums) {
        int pivot=findPivot(nums);
        return nums[pivot+1];
    }
    int findPivot(int[] nums){
        int start=0;
        int end= nums.length-1;
        while(start<=end){
            int mid = start+ (end-start)/2;
            
            if(nums[start]<nums[end]) return -1;
            
            if(start<mid && nums[mid]<nums[mid-1]){
                return mid-1;
            }
            if(mid<end && nums[mid]>nums[mid+1]){
                return mid;
            }
            if(nums[0]<nums[mid]){
                start= mid+1;
            }else{
                end=mid-1;
            }
        }
        return -1;
    }
}