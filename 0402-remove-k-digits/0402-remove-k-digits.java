class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> st = new Stack<>() ;
        for(char x : num.toCharArray()){
            while(!st.isEmpty() && k>0 && st.peek()>x){
                st.pop() ;
                k-- ;
            }
            st.push(x) ;
        }
        while (k > 0 && !st.isEmpty()) {
            st.pop();
            k--;
        }
        StringBuilder sb = new StringBuilder();
        while (!st.isEmpty()) {
            sb.append(st.pop());
        }

        sb.reverse();

        while (sb.length() > 0 && sb.charAt(0) == '0') {
            sb.deleteCharAt(0);
        }
        return sb.length() > 0 ? sb.toString() : "0";
    }
}