class Solution {
    public List<Integer> findAnagrams(String s, String p) {

        if(p.length()>s.length())return new ArrayList<>() ;

        List<Integer> ans = new ArrayList<>() ;
        Map<Character,Integer> map = new HashMap<>() ;
        Map<Character,Integer> pam = new HashMap<>() ;

        for(int i = 0 ; i<p.length() ; i++){
            map.put(p.charAt(i),map.getOrDefault(p.charAt(i),0)+1) ;
            pam.put(s.charAt(i),pam.getOrDefault(s.charAt(i),0)+1) ;
        }

        if(map.equals(pam)){
            ans.add(0) ;
        }
        int left = 0 ;
        for(int i = p.length() ; i<s.length() ; i++){
            pam.put(s.charAt(left) , pam.get(s.charAt(left))-1) ;

            if(pam.get(s.charAt(left))==0){
                pam.remove(s.charAt(left)) ;
            }

            left++ ;

            pam.put(s.charAt(i) , pam.getOrDefault(s.charAt(i),0)+1) ;
            if(map.equals(pam)){
                ans.add(left) ;
            }
        }
        return ans ;

    }
}