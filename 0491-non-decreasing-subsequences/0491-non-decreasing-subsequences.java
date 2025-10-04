class Solution {
    public List<List<Integer>> findSubsequences(int[] nums) {
        Set<List<Integer>> ans = new HashSet<>() ;
        print(ans,new ArrayList<>() , 0 , nums) ;
        List<List<Integer>> an = new ArrayList<>() ;
        for(List<Integer> l : ans){
            an.add(l) ;
        }
        return an ;
    }
    public void print(Set<List<Integer>> ans , List<Integer> ll , int i , int[] nums){
        if(i>=nums.length){
            if(ll.size()>=2){
                ans.add(new ArrayList<>(ll)) ;
            }
            return ;
        }
        print(ans,ll,i+1,nums) ; //notpick
        if(ll.size()==0 || ll.get(ll.size()-1) <= nums[i]){
            ll.add(nums[i]) ;
            print(ans,ll,i+1,nums) ; //pick
            ll.remove(ll.size()-1) ; //backtrack
        }
    }
}