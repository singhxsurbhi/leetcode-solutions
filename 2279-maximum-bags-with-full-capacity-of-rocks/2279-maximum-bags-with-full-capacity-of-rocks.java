class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        int n = capacity.length;
        int count=0;
        int[] space = new int[n];
        for(int i=0;i<n;i++){
            space[i]=capacity[i]-rocks[i];
        }
        
        Arrays.sort(space);
        for(int i=0;i<n && additionalRocks>0;i++){
            int temp=space[i];
            space[i] -= Math.min(additionalRocks,space[i]); 
            additionalRocks -= temp;
        }
        for(int i=0;i<n;i++){
            if(space[i]==0) count++;
        }
        return count;
    }
}



