class Solution {
    public int maxSubArray(int[] nums) {
        if(nums.length==1)return nums[0] ;
        int cs = nums[0] , ms = nums[0] ;
        for(int i = 1 ; i<nums.length ; i++){
            cs = Math.max(nums[i],cs+nums[i]) ;
            ms = Math.max(ms,cs) ;
        }
        return ms ;

    }
}