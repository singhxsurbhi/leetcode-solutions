class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        if(tokens.length==0 || tokens[0]>power) return 0;
        int low =0, high = tokens.length-1;
        int score =0;
        while(low<=high){  
            if(power>=tokens[low]){
                power -= tokens[low++];
                score++;
            }
            else{ 
                if(score>0 && high!=low){
                power += tokens[high];
                score--;
            }
                high--;
         }
        }
        return score>0?score:0;
    }
}