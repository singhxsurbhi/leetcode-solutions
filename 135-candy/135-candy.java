class Solution {
    public int candy(int[] ratings) {
        int n=ratings.length;
        int[] share= new int[n];
        Arrays.fill(share,1);
        for(int i=1;i<n;i++){
            if(ratings[i]>ratings[i-1]){
                share[i]=share[i-1]+1;
            }
        }
        for(int i=n-1;i>0;i--){
            if(ratings[i]<ratings[i-1] && share[i-1]<=share[i]){
                share[i-1]=share[i]+1;
            }
        }
        int min=0;
        for(int i=0;i<n;i++){
            min+=share[i];
        }
        return min;
    }
}