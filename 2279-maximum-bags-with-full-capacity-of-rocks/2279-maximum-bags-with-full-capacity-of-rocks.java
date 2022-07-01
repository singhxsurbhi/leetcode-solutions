class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
      int maxtotal=0;
        
        for(int i=0;i<boxTypes.length-1;i++){
            for(int j=0; j<boxTypes.length-i-1;j++){
            if(boxTypes[j][1] > boxTypes[j+1][1]){
                int temp[]=boxTypes[j];
                boxTypes[j]=boxTypes[j+1];
                boxTypes[j+1]=temp;
            }
           }
        }
        
        for(int i=boxTypes.length-1;i>=0 && truckSize>0 ;i--){
            maxtotal += Math.min(boxTypes[i][0],truckSize)*boxTypes[i][1];
            truckSize -= boxTypes[i][0];
        }
        return maxtotal;
      }
}