class Solution {
    public int mostWordsFound(String[] sentences) {
        int j =0, ans=0;
        while(j<sentences.length){
            int count=1;
            for(int i=0; i<sentences[j].length(); i++){
                if(sentences[j].charAt(i) == ' ') count++; 
            }
            ans=Math.max(count,ans);
            j++;
        }
      return ans;  
    }
}