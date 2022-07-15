class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> spiral = new ArrayList<>();
        int rEnd = matrix.length-1;
        int cEnd = matrix[0].length-1;
        int cStart = 0;
        int rStart = 0;
        int count=0;
        int t=(matrix[0].length)*(matrix.length);
        while(t>count){
            for(int i = cStart; i<=cEnd && t>count;i++){
                spiral.add(matrix[rStart][i]);
                count++;
            }
            rStart++;
            for(int i=rStart;i<=rEnd && t>count;i++){
                spiral.add(matrix[i][cEnd]);
                count++;
            } 
            cEnd--;
            for(int i=cEnd;i>=cStart && t>count;i--){
                spiral.add(matrix[rEnd][i]);
                count++;
            }
            rEnd--;
            for(int i=rEnd;i>=rStart && t>count;i--){
                spiral.add(matrix[i][cStart]);
                count++;
            }
            cStart++;
        }
        return spiral;
    }
}