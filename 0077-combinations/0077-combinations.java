class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>() ;
        print(ans,new ArrayList<>() , n , k , 1) ;
        return ans ;
    }
    public void print(List<List<Integer>> ans , List<Integer> l , int n, int k , int f){
        if(l.size()==k){
            ans.add(new ArrayList<>(l)) ;
            return ;
        }
        for(int i =  f ; i<=n ; i++){
            l.add(i) ;
            print(ans,l,n,k,i+1) ;
            l.remove(l.size()-1) ;
        }
    }
}