class Solution {
    public int compress(char[] chars) {
        int start=0;
        int end=0;
        
        StringBuilder sb= new StringBuilder();
       
        while(start<=end && end<chars.length){
            char ch= chars[start];
            end++;
            if((end<chars.length) && ch==chars[end]){
                continue;
            }else{
                sb.append(ch);
                int count= end-start;
                if(count>1) sb.append(count);
            }
            start=end;
        }
        for(int i=0;i<sb.length();i++){
            chars[i]=sb.charAt(i);
        }
        return sb.length();
    }
}