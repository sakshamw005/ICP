class Solution {
    public int numIslands(char[][] grid) {
        int ans = 0 , m = grid.length , n = grid[0].length ;
        for(int i = 0 ; i<m ; i++){
            for(int j = 0 ; j<n ; j++){
                if(grid[i][j]=='1'){
                    ans++ ;
                    dfs(grid,i,j) ;
                }
            }
        }
        return ans ;
    }
    public void dfs(char[][] grid , int i , int j){
        if(i<0 || i>=grid.length || j >= grid[0].length || j<0 || grid[i][j]!='1')return ;

        grid[i][j] = '0' ;
        dfs(grid,i+1,j) ;
        dfs(grid,i,j+1) ;
        dfs(grid,i-1,j) ;
        dfs(grid,i,j-1) ;

    } 
}