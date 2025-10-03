class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>() ;
        print(candidates ,target,0,0,new ArrayList<>(),ans) ;
        return ans ;
    }
    public void print(int[] candidates, int target , int si , int currsum ,
                         List<Integer> l , List<List<Integer>> ans){
        if(currsum==target){
            ans.add(new ArrayList<>(l)) ;
        }
        if(si>=candidates.length || currsum>target){
            return ;
        }
        Arrays.sort(candidates) ;
        for(int i = si ; i<candidates.length ; i++){
            if(i>si && candidates[i-1]==candidates[i])continue; 
            l.add(candidates[i]) ;
            print(candidates,target,i+1,currsum+candidates[i],l,ans) ;
            l.remove(l.size()-1) ;
        }
    }
}