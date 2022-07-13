class Solution {
    public String interpret(String command) {
        StringBuilder parse= new StringBuilder();
        for(int i=0; i<command.length(); i++){
            if(command.charAt(i)=='G'){
                parse.append("G");
            }
            else if(command.charAt(i)=='(' ){
                if(command.charAt(i+1)==')'){
                    parse.append("o");
                    i++;
                } else if(command.charAt(i+1)=='a') {
                    parse.append("al");
                    i+=3;
                }
            }
        }
        return parse.toString();
    }
}