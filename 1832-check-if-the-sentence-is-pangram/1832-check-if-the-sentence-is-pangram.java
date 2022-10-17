class Solution {
    public boolean checkIfPangram(String sentence) {
        Set<Character> set = new HashSet<>();
        for(char curr : sentence.toCharArray()){
            set.add(curr);
        }
        return set.size()==26;
    }
}