class Solution {
    public void sortColors(int[] nums) {
         for (int i = 0; i < nums.length-1; i++) {
            for (int j = i+1; j >0 ; j--) {
                if(nums[j]<nums[j-1]){
                    swap(nums,j,j-1);
                }else{
                    break;
                }
            }
         }
    }
    static void swap(int[] nums, int first, int second){
        int temp=nums[second];
        nums[second]=nums[first];
        nums[first]=temp;
    }
}