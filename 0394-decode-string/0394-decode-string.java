class Solution {
    int i = 0 ;
    public String decodeString(String s) {
        return decode(s) ;
    }
    public String decode(String s){
        StringBuilder ans = new StringBuilder() ;
        int num = 0 ;
        while(i<s.length()){
            char x = s.charAt(i) ;
            if(Character.isDigit(x)){
                num = num*10 + (x-'0') ;
                i++ ;
            }
            else if(x=='['){
                i++ ;
                String inn = decode(s) ;
                for(int i = 0 ; i<num ; i++){
                    ans.append(inn) ;
                }
                num = 0 ;
            }
            else if(x==']'){
                i++ ;
                return ans.toString() ;
            }
            else{
                ans.append(x) ;
                i++ ;
            }
        }
        return ans.toString() ;
    }
}