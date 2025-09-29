class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>() ;
        int m = matrix.length , n = matrix[0].length ;
        int l = 0 , r = n-1 , up = 0 , down = m - 1 ;
        while(l<=r && up<=down){
            for(int i = l ; i<=r ; i++)ans.add(matrix[up][i]) ; // l to r
            for(int i = up+1 ; i<=down ; i++)ans.add(matrix[i][r]) ; // t to b
            if(up < down)for(int i = r-1 ; i>=l ; i--) ans.add(matrix[down][i]) ; 
            if(l < r)for(int i = down-1 ; i>up ; i--) ans.add(matrix[i][l]) ; 
            l++ ;
            r-- ;
            up++ ;
            down-- ;
        }
        return ans ;
    }
}