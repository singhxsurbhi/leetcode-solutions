class Solution {
    public int balancedStringSplit(String s) {
        int count=0;
        
        int ans=0;
        int i=0;
        
        while(i<s.length()){
            if(s.charAt(i)=='L') count++;
            else if(s.charAt(i)=='R') count--;
            
            if(count==0){
                ans++;
            }
            i++;
        }
        return ans;
    }
}