class Solution {
    public String simplifyPath(String path) {
        String arr[] = path.split("/") ; 
        Stack<String> st = new Stack<>() ;
        for(String i : arr){
            if(i.equals("") || i.equals("."))continue ;
            else if (i.equals("..")) {
                if (!st.isEmpty()) st.pop();
            }
            else{
                st.push(i) ;
            }
        }
        StringBuilder ans = new StringBuilder() ;
        for (String dir : st) {
            ans.append("/").append(dir);
        }
        return ans.length() == 0 ? "/" : ans.toString();
    }
}