class Solution {
    public int deleteAndEarn(int[] nums) {
      int count=0;
      int skip=0;
        
        int[] dp=new int[10001];
        for(int s : nums)
            dp[s]++;
        
        for(int i=0;i<=10000;i++){
            int numi=skip+dp[i]*i;
            int nume= Math.max(count,skip);
            
            count=numi;
            skip=nume;
        }
       
       
        
        return Math.max(count, skip);
        
    }
}