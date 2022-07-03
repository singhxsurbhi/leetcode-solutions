class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        ArrayList<Integer> odd = new ArrayList<Integer>(nums.length/2);
        ArrayList<Integer> even = new ArrayList<Integer>(nums.length/2);
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                even.add(nums[i]);
            } 
            else{
                odd.add(nums[i]);
            }
        }
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                nums[i]=even.get(i/2);
            }
            else{
                nums[i]=odd.get(i/2);
            }
        }
        return nums;
    }
}