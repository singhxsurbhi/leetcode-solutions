class Solution {
    public String reversePrefix(String word, char ch) {
        int pos=-1;
        for(int i=0;i<word.length();i++){
            if(word.charAt(i)== ch){
                pos=i;
                break;
            }
        }
        if(pos<=0) return word;
         StringBuilder sb= new StringBuilder(word);
        if(pos>0){
            for(int i=0;i<=pos;i++){
                    sb.setCharAt(i,word.charAt(pos-i));
                }
        }
        return sb.toString();
    }
}