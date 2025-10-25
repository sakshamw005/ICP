class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] nar = new int[10001] ;
        Stack<Integer> st = new Stack<>() ;
        for(int i = 0 ; i < nums2.length ; i++){
            while(!st.isEmpty() && st.peek() < nums2[i]){
                nar[st.pop()] = nums2[i] ;
            }
            st.push(nums2[i]) ;
        }
        for(int i = 0 ; i<nums1.length ; i++){
            int ans = nar[nums1[i]] ;
            if(ans==0)nums1[i] = -1 ;
            else{
                nums1[i] = ans ;
            }
        }
        return nums1 ;
    }
}