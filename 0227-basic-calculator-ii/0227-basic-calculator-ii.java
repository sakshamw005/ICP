class Solution {
    public int calculate(String s) {
        s = s.trim() ;
        int num = 0 ;
        char var = '+' ;
        Stack<Integer> st = new Stack<>() ;
        for(int i = 0 ;  i<s.length() ; i++){
            char temp = s.charAt(i) ;
            if(Character.isDigit(temp)){
                num = num*10 + (temp-'0') ;
            }
            if(!Character.isDigit(temp) && temp!=' '|| i == s.length() - 1){
                if(var=='+'){
                    st.push(num) ;
                }
                else if(var=='-'){
                    st.push(-num) ;
                }
                else if(var=='*'){
                    st.push(num*st.pop()) ;
                }
                else if(var=='/'){
                    st.push(st.pop()/num) ;
                }
                var = temp ;
                num = 0 ;
            }
        }
        int ans = 0 ;
        while(!st.isEmpty()){
            ans+=st.pop() ;
        }
        return ans ;
    }
}