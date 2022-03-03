class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        int n=mat.length;
        int[][] newmat1= new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
               newmat1[i][j]= mat[j][n-i-1]; 
            }
        }
        
        int[][] newmat2= new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                newmat2[i][j]= newmat1[j][n-i-1]; 
            }
        }
        
        int[][] newmat3= new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                newmat3[i][j]= newmat2[j][n-i-1]; 
            }
        }
        if(Arrays.deepEquals(target,newmat1) || Arrays.deepEquals(target,newmat2) || Arrays.deepEquals(target,newmat3) || Arrays.deepEquals(target,mat) ){ 
            return true;
        }
        return false;
    }
}