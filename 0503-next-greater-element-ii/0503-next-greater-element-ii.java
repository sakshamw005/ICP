class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length ;
        int[] res = new int[n] ;
        Arrays.fill(res,-1) ;
        Stack<Integer> st = new Stack<>() ;
        for(int i = 2*n-1 ; i>=0 ; i--){
            int l = i%n ;
            while(!st.isEmpty() && st.peek()<=nums[l]){
                st.pop() ;
            }
            if(!st.isEmpty()){
                res[l] = st.peek() ;
            }
            st.push(nums[l]) ;
        }
        return res ;
    }
}