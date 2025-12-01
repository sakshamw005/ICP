class Solution {
    public String removeKdigits(String num, int k) {
        if(num.length()==k)return "0" ;
        Stack<Character> st = new Stack<>() ;
        for(char x : num.toCharArray()){
            while(!st.isEmpty() && st.peek()>x && k>0){
                st.pop() ;
                k-- ;
            }
            st.push(x) ;
        }
        while(k>0 && !st.isEmpty()){
            st.pop() ;
            k-- ;
        }
        StringBuilder ans = new StringBuilder() ;
        while(!st.isEmpty())ans.append(st.pop()) ;
        ans.reverse() ;
        boolean seen = false ;
        while (ans.length() > 0 && ans.charAt(0) == '0') {
            ans.deleteCharAt(0);
        }
        return ans.length() > 0 ? ans.toString() : "0" ;
    }
}