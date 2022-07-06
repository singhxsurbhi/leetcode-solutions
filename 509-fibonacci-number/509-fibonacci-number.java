class Solution {
    public int fib(int n) {
        if(n<=1) return n;
        int[] fibSeq=new int[31];
        fibSeq[0]=0;
        fibSeq[1]=1;
        for(int i=2; i<=n;i++){
            fibSeq[i]=fibSeq[i-1]+fibSeq[i-2];
        }
        return fibSeq[n];
    }
}