class Solution {
    public void rotate(int[] nums, int k) {
        int[] copy= new int[nums.length];
        int rot= k % nums.length;
        for(int i= 0;i<nums.length;i++){
            copy[(i+rot)%nums.length] = nums[i];
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=copy[i];
        }
    }
}