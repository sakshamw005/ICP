class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>() ;
        for(int i : asteroids){
            boolean x = true ;
            while(!st.isEmpty() && i<0 && st.peek()>0){
                if(st.peek() < -i){
                    st.pop() ;
                    continue ;
                }
                else if(st.peek()==-i){
                    st.pop() ;
                }
                x = false ;
                break ;
            }
            if(x){
                st.push(i) ;
            }
        }
        int[] ans = new int[st.size()] ;
        for(int i = st.size()-1 ; i>=0 ; i--){
            ans[i] = st.pop() ;
        } 
        return ans ;
    }
}