class Solution {
    public boolean increasingTriplet(int[] nums) {
        int least=Integer.MAX_VALUE,mid=Integer.MAX_VALUE;
        for(int num: nums){
            if(num<=least) least=num;
            else if(num<=mid) mid=num;
            else return true;
        }
        return false;
    }
}