class Solution {
    public int numberOfWeakCharacters(int[][] properties) {
        int result =0;
        int min= Integer.MIN_VALUE;
        
        Arrays.sort(properties,(a,b) -> a[0]==b[0] ? b[1]-a[1] : a[0]-b[0]);
        
        for(int i=properties.length-1;i>=0;i--){
            int[] arr = properties[i];
            int attack = arr[0];
            int defense = arr[1];
            if(defense < min){
                result++;
            }
            min=Math.max(min,defense);
        }
        return result;
    }
}