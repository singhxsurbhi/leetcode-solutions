class Solution {
    public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int common=0;
        int a =((ay2-ay1)*(ax2-ax1));
        int b = ((bx2-bx1)*(by2-by1));
        if(ax1 < bx2 && ay1 < by2 && bx1 <ax2 && by1< ay2){
         common = (((Math.min(ax2,bx2))-Math.max(ax1,bx1))*((Math.min(ay2,by2))-Math.max(ay1,by1)));
        }
            return a+b-common;
    }
}