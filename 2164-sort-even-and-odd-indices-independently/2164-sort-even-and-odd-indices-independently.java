class Solution {
    public int[] sortEvenOdd(int[] nums) {
        if(nums.length<3) return nums;
        
        ArrayList<Integer> odd = new ArrayList<>();
        ArrayList<Integer> even = new ArrayList<>();
     
        for(int i=0 ; i<nums.length ; i++){
            if(i%2==0) even.add(nums[i]);
            else odd.add(nums[i]);
        }
        Collections.sort(even);
        Collections.sort(odd,Collections.reverseOrder());
          int i = 0;
    int p = 0;
    int q = 0;
    
    while(i < nums.length){
        
        if(i % 2 == 0){
            nums[i] = even.get(p);
            p++;
        }
        
        else {
            nums[i] = odd.get(q);
            q++;
        }
        i++;
    }   
        return nums;
    }
}