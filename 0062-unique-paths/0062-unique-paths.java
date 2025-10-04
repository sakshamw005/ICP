class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n] ;
        for(int[] i : dp)Arrays.fill(i,-1) ;
        return calc(0,0,m,n,dp) ;
    }
    public int calc( int row , int col , int m, int n , int[][] dp){
        if(row==m-1 && col==n-1){
            return 1 ;
        }
        if(row>=m || col>=n){
            return 0 ;
        }
        if(dp[row][col]!=-1){
            return dp[row][col] ;
        }
        int a = calc(row+1,col,m,n,dp) ; //down
        int b = calc(row,col+1,m,n,dp) ; //right
        return dp[row][col] = a+b; 
    }
}