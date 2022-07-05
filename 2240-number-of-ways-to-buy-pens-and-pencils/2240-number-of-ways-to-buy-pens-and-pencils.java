class Solution {
    public long waysToBuyPensPencils(int total, int cost1, int cost2) {
        if(cost1>total && cost2>total) return 1;
        long count=0;
        for(int i=0;i<=total/cost1;i++){
            count+=(total-i*cost1)/cost2+1;
        }
        return count;
    }
}