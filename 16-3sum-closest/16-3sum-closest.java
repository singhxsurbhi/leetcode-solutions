class Solution {
    public int threeSumClosest(int[] nums, int target) {
        if (nums.length == 3) return nums[0] + nums[1] + nums[2];

       
        Arrays.sort(nums);

        int minDiff = Integer.MAX_VALUE;
        
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int idx = Arrays.binarySearch(nums, j + 1, nums.length, target - nums[i] - nums[j]);

                if (idx >= 0) return target;
                else{
                    idx = - idx - 1;
                    if (idx - 1 > j){
                        int diff = nums[i] + nums[j] + nums[idx - 1] - target;
                        if (Math.abs(diff) < Math.abs(minDiff)) minDiff = diff;
                    }
                    if (idx < nums.length) {
                        int diff = nums[i] + nums[j] + nums[idx] - target;
                        if (Math.abs(diff) < Math.abs(minDiff)) minDiff = diff;
                    }
                }
            }
        }
        return target + minDiff;  
    }
}