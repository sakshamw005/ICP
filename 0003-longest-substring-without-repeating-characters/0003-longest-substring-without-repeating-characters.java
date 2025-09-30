class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0){
            return 0 ;
        }
        int ans = 1 , l = 0 ;
        Set<Character> ss = new HashSet<>() ;
        for(int i = 0 ; i<s.length() ; i++){
            char x = s.charAt(i) ;
            while(ss.contains(x)){
                ss.remove(s.charAt(l++)) ;
            } 
            ss.add(x) ;
            ans = Math.max(ans,i-l+1) ;
        }
        return ans ;
    }
}