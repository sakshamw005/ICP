class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length())return false ;
        Map<Character,Integer> m1 = new HashMap<>() ;
        Map<Character,Integer> m2 = new HashMap<>() ;

        for(int i = 0 ; i<s1.length() ; i++){
            m1.put(s1.charAt(i),m1.getOrDefault(s1.charAt(i),0)+1) ;
            m2.put(s2.charAt(i),m2.getOrDefault(s2.charAt(i),0)+1) ;
        }

        if(m1.equals(m2))return true ;

        int left = 0 ;
        for(int i = s1.length() ; i<s2.length() ; i++){
            m2.put(s2.charAt(i),m2.getOrDefault(s2.charAt(i),0)+1) ;

            m2.put(s2.charAt(left) , m2.get(s2.charAt(left))-1) ;
            if(m2.get(s2.charAt(left))==0){
                m2.remove(s2.charAt(left)) ;
            }
            left++ ;

            if(m1.equals(m2)){
                return true ;
            }
        }
        return false ;
    }
}