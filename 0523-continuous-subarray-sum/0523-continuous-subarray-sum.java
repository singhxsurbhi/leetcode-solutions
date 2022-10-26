class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        for(int i=1 ; i<nums.length ; i++){
			if(nums[i] == 0 && nums[i-1] == 0){
				return true;
			}
		}


		int[] prefix = new int[nums.length];
		prefix[0] = nums[0];

		for(int i=1 ; i<nums.length ; i++){
			prefix[i] = prefix[i - 1] + nums[i];
			if(prefix[i] % k == 0){
				return true;
			}

			int j = i - 2;
			while((j >= 0) && (prefix[i] - prefix[j] >= k)){
				if((prefix[i] - prefix[j]) % k == 0){
					return true;
				}
				j--;
			}
		}

		return false;
    }
}