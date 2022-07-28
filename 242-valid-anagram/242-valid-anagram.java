class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        
        char[] s_array= s.toCharArray();
        char[] t_array= t.toCharArray();
        
        Arrays.sort(s_array);
        Arrays.sort(t_array);
        
        String s1 = new String(s_array);
        String s2 = new String(t_array);
        return s1.equals(s2);
    }
}