class Solution {
    public int romanToInt(String s) {
      int ans = 0, curr = 0, prev=-1;
      for(int i = 0; i <s.length(); i++) {
        switch(s.charAt(i)) {
          case 'I' : curr = 1; break;
          case 'V' : curr = 5; break;
          case 'X' : curr = 10; break;
          case 'L' : curr = 50; break;
          case 'C' : curr = 100; break;
          case 'D' : curr = 500; break;
          case 'M' : curr = 1000; break;
        }
        if(i==0) ans=ans+curr;
        else{
             if(prev>=curr) ans+=curr;
             else ans= ans+curr-2*prev;
            }
        prev=curr;
      }
      return ans;
    }
}