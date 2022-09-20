class Solution {
    public int findLength(int[] nums1, int[] nums2) {
        int max = 0;
        int n1 = nums1.length, n2 = nums2.length;
        for(int i=-n2+1; i<n1; i++) {
            int count=0;
            for(int j=0; j<n2; j++) {
                if(i+j < 0)
                    continue;
                else if(i+j >= n1)
                    break;
                else if(nums1[i+j] == nums2[j]) {
                    count++;
                    max = Math.max(max, count);
                }
                else 
                    count = 0;
            }
        }
        return max;
    }
}