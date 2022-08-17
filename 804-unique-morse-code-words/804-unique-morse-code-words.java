class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        HashSet<String> set = new HashSet<>();
        
        String[] s ={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        
        for(String word:words){
            String symbol ="";
            for(char c : word.toCharArray()){
                symbol += s[c-'a'];
            }
            set.add(symbol);
        }
        return set.size();
    }
}