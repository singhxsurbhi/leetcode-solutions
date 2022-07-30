class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
         List<String> result = new ArrayList<>();
        
        int[] target = new int[26];
        
        for(String b:words2){
            int[] temp=new int[26];
            
            for(char c:b.toCharArray()){
                temp[c-'a']++;
                target[c-'a'] = Math.max(target[c-'a'],temp[c-'a']);
            }
        }
        
        for(String a:words1){
            int[] arr=new int[26];
            
            for(char c:a.toCharArray()) arr[c-'a']++;
            
            if(subset(arr,target)){
                result.add(a);
            }
        }
        
        return result;
    }
    
     boolean subset(int[] source,int[] dest){
        for(int i=0;i<26;i++){
            if(dest[i]>source[i]) return false;
        }
        return true;
    }
}