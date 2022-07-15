class Solution {
    public int[][] generateMatrix(int n) {
        int rEnd = n-1;
        int cEnd = n-1;
        int cStart = 0;
        int rStart = 0;
        int count=1;
        int[][] matrix= new int[n][n];
        int t=(matrix.length)*(matrix.length);
        while(t>=count){
            for(int i = cStart; i<=cEnd && t>=count;i++){
                matrix[rStart][i]=count++;
            }
            rStart++;
            for(int i=rStart;i<=rEnd && t>=count;i++){
                matrix[i][cEnd]=count++;
            } 
            cEnd--;
            for(int i=cEnd;i>=cStart && t>=count;i--){
                matrix[rEnd][i]=count++;
            }
            rEnd--;
            for(int i=rEnd;i>=rStart && t>=count;i--){
                matrix[i][cStart]=count++;
            }
            cStart++;
        }
        return matrix;
    }
}