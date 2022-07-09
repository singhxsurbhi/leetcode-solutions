class Solution {
    public int lengthOfLastWord(String s) {
        int n = s.length()-1;
        int last=0;
        int first=0;
        while(n>=0){
            if(s.charAt(n)!= ' '){
                last=n;
                break;
            }else n--;
        }
        for(int i=last;i>=0;i--){
            if(s.charAt(i)!= ' '){
                first=i;
            } else{
                break;
            }
        }
     return last-first+1;
    }
}