class Solution {
    public String longestCommonPrefix(String[] strs) {
        String l = strs[0];
        for(int i=1;i<strs.length;i++){
            while (strs[i].indexOf(l) != 0) {
            l = l.substring(0, l.length() - 1);
            if (l.isEmpty()) return "";
        }        
        }
        return l;
    }
}