class Solution {
    public String convert(String s, int numRows) {
        if(numRows == 1 || numRows >=s.length()) return s;
        StringBuilder sb = new StringBuilder();
        for(int i= 0; i < numRows; i++){
            int j=i;
            while(j<s.length()){
                sb.append(s.charAt(j));
                if(i!=0 && i!=numRows-1 && j+(2*(numRows-1))-(2*i)<s.length()) {
				sb.append(s.charAt(j+(2*(numRows-1))-(2*i)));
			}
			j+=(2*(numRows-1));
		}
	}
	return sb.toString();
    }
}


