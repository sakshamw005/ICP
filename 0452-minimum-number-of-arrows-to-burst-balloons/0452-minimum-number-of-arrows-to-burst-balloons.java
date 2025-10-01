class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, new Comparator<int[]>(){
            public int compare(int[] a1 , int[] a2){
                if(a1[0]==a2[0])return 0 ;
                if(a1[0]<a2[0])return -1 ;
                else{
                    return 1 ;
                }
            }
        }) ;
        int ep = points[0][1] ;
        int ans = 1 ;
        for(int i = 1 ; i<points.length ; i++){
            if(ep>=points[i][0]){
                ep = Math.min(ep,points[i][1]) ;
            }
            else{
                ans++ ;
                ep = points[i][1] ;
            }
        }
        return ans ;
    }
}