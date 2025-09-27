class Solution {
    public boolean isPerfectSquare(int num) {
        int l = 1 , h = num ;
        while(l<=h){
            int mid = l + (h-l)/2 ;
            long hehe = (long)Math.pow(mid,2) ;
            if(hehe==num){
                return true ;
            }
            else if(hehe>num){
                h = mid - 1 ;
            }
            else{
                l = mid + 1 ;
            }
        }
        return false ;
    }
}