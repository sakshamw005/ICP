class Solution {
    public String removeDuplicates(String s, int k) {
        Stack<Pair> st = new Stack<>() ;
        for(char x : s.toCharArray()){
            if(!st.isEmpty() && st.peek().ch==x){
                st.peek().count++ ;
                if(st.peek().count==k){
                    st.pop() ;
                }
            }
            else{
                st.push(new Pair(x,1)) ;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (Pair p : st) {
            for (int i = 0; i < p.count; i++) {
                sb.append(p.ch);
            }
        }
        return sb.toString() ;
    }
    private static class Pair {
        char ch;
        int count;
        Pair(char ch, int count) {
            this.ch = ch;
            this.count = count;
        }
    }
}