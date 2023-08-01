class Solution {
    public int countBattleships(char[][] board) {
        int count=0;

        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[i].length;j++){
                if(board[i][j]=='X'){
                    count++;
                    dfs(board,i,j);
                }
            }
        }
        return count;
    }

    public void dfs(char [][]grid,int row,int col){
        if(row<0 || row>=grid.length || col<0 || col>=grid[row].length || grid[row][col]=='.'){
            return;
        }
        grid[row][col]='.';
        dfs(grid,row+1,col);
        dfs(grid,row-1,col);
        dfs(grid,row,col+1);
        dfs(grid,row,col-1);
        return;
        
         }
}
