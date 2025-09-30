class Solution {
    public int characterReplacement(String s, int k) {
        int l = 0 , r = 0 , maxf = 0 , ans = 0 ;
        int[] freq = new int[26] ;
        while(r<s.length()){
            freq[s.charAt(r) - 'A']++ ;
            maxf = Math.max(maxf ,freq[s.charAt(r) - 'A'] ) ;
            if((r-l+1) - maxf > k){
                freq[s.charAt(l++) - 'A']-- ;
            }
            ans = Math.max(ans,(r-l+1)) ;
            r++ ;
        }
        return ans ;
    }
}