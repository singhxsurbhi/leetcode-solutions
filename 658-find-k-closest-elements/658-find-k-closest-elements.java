class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
    List<Integer> list  = new ArrayList<>();
    int i=0,j=arr.length-k;
    while(i<j){
        int mid = i+j>>1;
        if(arr[mid+k]-x < x-arr[mid]) i=mid+1;
        else j= mid;
    }
    for(int a=i;a<j+k;a++){ 
        list.add(arr[a]);
    }
    return list;
    }
}