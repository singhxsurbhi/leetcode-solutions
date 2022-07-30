class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.length() > haystack.length()) return -1;
        
        if(needle.length() == 0) return 0;
        
        for(int i=0;i<=haystack.length()-needle.length();i++){
            if(substring(haystack,needle,i)) return i;
        }
        return -1;
    }
    boolean substring(String s1, String s2, int index){
    int start=0;
    while(start<s2.length()){
        if(s1.charAt(index++)!=s2.charAt(start++)) return false;
    }
        return true;
    }
}