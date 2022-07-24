class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        return search(matrix,target);
    }
    public boolean search(int[][] arr, int target){
        int r = 0;
        int c = arr[0].length-1;
        while(r<arr.length && c>=0){
        if(arr[r][c] == target){
            return true;
        }
        if(arr[r][c] > target){
            c--;
        }
        else{
            r++;
        }
        }
        return false;
    }
}