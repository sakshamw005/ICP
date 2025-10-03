class Solution {
    public boolean exist(char[][] board, String word) {
        boolean[][] used = new boolean[board.length][board[0].length] ;

        for(int i = 0 ; i<board.length ; i++){
            for(int j = 0 ; j<board[0].length ; j++){
                if(make(board,word,used,i,j,0)){
                    return true ;
                }
            }
        }
        return false ;
    }
    public boolean make(char[][] board, String word , boolean[][] used , int row , int col , int i){
        if(i==word.length())return true ;
        if(row<0 || row>=board.length || col<0 || col>=board[0].length 
            || used[row][col] || word.charAt(i)!=board[row][col]){
            return false ;
        }

        used[row][col] = true ;

        boolean ans = 
        make(board,word,used,row-1,col,i+1) || 
        make(board,word,used,row,col-1,i+1) || 
        make(board,word,used,row+1,col,i+1) || 
        make(board,word,used,row,col+1,i+1) ;

        used[row][col] = false ;

        return ans ;

    }
}