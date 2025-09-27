class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int pos = m+n-1 ;
        int mi = m - 1 , ni = n - 1 ;
        while(ni!=-1){
            if(mi!=-1 && nums1[mi] > nums2[ni]){
                nums1[pos] = nums1[mi] ;
                mi-- ;
            }
            else{
                nums1[pos] = nums2[ni] ;
                ni-- ;
            }
            pos-- ;
        }
    }
}