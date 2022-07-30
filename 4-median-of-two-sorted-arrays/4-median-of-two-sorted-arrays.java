class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] merge = new int[nums1.length+nums2.length];
        for(int i=0; i<nums1.length;i++){
            merge[i]=nums1[i];
        }
        for(int j=0;j<nums2.length;j++){
            merge[nums1.length+j]=nums2[j];
        }
        Arrays.sort(merge);
        int m= merge.length;
        double ans;
        if(m%2==0) ans = ((double) merge[m/2]+ (double) merge[(m-1)/2])/2;
        else ans= (double) merge[m/2];
        return ans;
    }
}