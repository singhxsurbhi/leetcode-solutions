class Solution {
    public boolean checkIfExist(int[] arr) {
        Arrays.sort(arr);
        for(int i = 0 ; i < arr.length ; i++){
            int target = 2*arr[i];
            if(arr[i]!=0){
            if (binarySearch(arr, target, 0, arr.length-1)){
                return true;
            }
            } else{
                for(int j=i+1; j<arr.length;j++){
                    if(arr[j]==target) return true;
                }
            }
        }
        return false;     
    }
    
    boolean binarySearch(int[] nums, int target, int start, int end){
        while(start<=end){
            int mid= start+(end-start)/2;
            
            if(nums[mid]== target) return true;
            if(nums[mid]>target){
                end= mid-1;
            }else{
                start=mid+1;
            }
        }
        return false;
    }
}