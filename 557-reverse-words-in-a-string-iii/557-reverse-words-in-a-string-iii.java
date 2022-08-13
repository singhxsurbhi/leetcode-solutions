class Solution {
    public String reverseWords(String s) {
        int start=-1;
        int end = 0;
        StringBuilder sb = new StringBuilder();
        
        while(end<s.length() && start<=end){
            if(s.charAt(end) == ' ' || end == s.length()-1){
                int last= end<s.length()-1 ? end-1 : end ;
                while(last>start){
                    sb.append(s.charAt(last));
                    last--;
                }
                start=end;
                if(end != sb.length()-1) sb.append(" ");
            }
            
            end++;
        }
        return new String(sb);
    }
}