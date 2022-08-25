class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote.length()> magazine.length()) return false;
        int[] count = new int[26];
        for(char ch: magazine.toCharArray()) {
            count[ch - 'a']++;
        }
        for(char ch: ransomNote.toCharArray()) {
            int val = ch - 'a';
            if(count[val] <= 0) return false;
            count[val]--;
        }
        return true;
    }
}