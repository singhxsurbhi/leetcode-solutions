class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> list= new ArrayList<>();
        for(int i=0,j=0;i<n && j<target.length;i++,j++){
                list.add("Push");      
            if(i+1!=target[j]){
                list.add("Pop");
              j--;
            } 
        }
        return list;
    }
}