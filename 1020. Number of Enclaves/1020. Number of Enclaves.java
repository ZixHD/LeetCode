class Solution {
    public int numEnclaves(int[][] grid) {
        
        int row = grid.length;
        int col = grid[0].length;
        int count = 0;

        for(int i = 0; i < row; i++){
            for( int j = 0; j < col; j++){
                if(i == 0 || j == 0 || i == row - 1 || j == col - 1){
                    if(grid[i][j] == 1){
                        dfs(grid, i, j);
                    }
                }
            }
        }

        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                if(grid[i][j] == 1){
                    count++;
                }
            }
        }

        return count;
       
    }

    public void dfs(int[][] grid, int row, int col){

        if(row < 0 || row >= grid.length || col < 0 || col >=grid[0].length || grid[row][col] == 0 || grid[row][col] == -1){
            return;
        }
        grid[row][col] = -1;
        dfs(grid, row+1, col);
        dfs(grid, row-1, col);
        dfs(grid, row, col+1);
        dfs(grid, row, col-1);
    }
}
