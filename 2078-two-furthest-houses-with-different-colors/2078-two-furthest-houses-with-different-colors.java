class Solution {
    public int maxDistance(int[] colors) {
        int max=0;
        for(int i=0;i<colors.length;i++){
            for(int j=i+1;j<colors.length;j++){
                if(colors[j]-colors[i]!=0){
                    int temp=j-i;
                    max=Math.max(max,temp);
                }
            }
        }
        return max;
    }
}