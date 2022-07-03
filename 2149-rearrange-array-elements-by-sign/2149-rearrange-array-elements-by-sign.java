class Solution {
    public int[] rearrangeArray(int[] nums) {
        ArrayList<Integer> pos = new ArrayList<Integer>(nums.length/2);
        ArrayList<Integer> neg = new ArrayList<Integer>(nums.length/2);
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                neg.add(nums[i]);
            } 
            else{
                pos.add(nums[i]);
            }
        }
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                nums[i]=pos.get(i/2);
            }
            else{
                nums[i]=neg.get(i/2);
            }
        }
        return nums;
    }
}