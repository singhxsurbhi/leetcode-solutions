class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        int n = s.length();
        int lastIndex=-1;
        
        for(int i=0;i<n;i++){
        if(s.charAt(i)==' ' || i==n-1){
            int reverse=(i == n-1) ? i:i-1;
            for(;reverse>lastIndex;reverse--){
                sb.append(s.charAt(reverse));
            }
            if(i != n-1){
                sb.append(" ");
            }
            lastIndex=i;

        }
        }
        
        return new String(sb);
    }
}