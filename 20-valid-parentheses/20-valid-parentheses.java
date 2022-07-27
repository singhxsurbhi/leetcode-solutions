class Solution {
    public boolean isValid(String s) {
        if(s.length()%2!=0) return false;
        
        Stack<Character> stack = new Stack<>();
        
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i)==')' && stack.size()!=0 && stack.peek()=='('){
                stack.pop();
            }
            else if(s.charAt(i)=='}' && stack.size()!=0 && stack.peek()=='{'){
                stack.pop();
            }
            else if(s.charAt(i)==']' && stack.size()!=0 && stack.peek()=='['){
                stack.pop();
            }
            else{
                stack.push(s.charAt(i));
            }
        }
        return stack.isEmpty();
    }
}