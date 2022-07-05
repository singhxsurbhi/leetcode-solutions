class Solution {
    public int countEven(int num) {
        int count=0;
        for(int i=1;i<=num;i++){
            if(sumEven(i)) count++;
        }
        return count;
    }
    private boolean sumEven(int n){
         int temp=0;
               while(n>0){
                   temp+=n%10;
                   n/=10;
               }
                return (temp%2==0) ? true:false;
    }
}