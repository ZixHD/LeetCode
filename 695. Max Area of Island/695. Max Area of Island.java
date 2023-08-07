class Solution {
    public int maxAreaOfIsland(int[][] grid) {
       
       int max = 0;;
       for(int i = 0; i < grid.length; i++){
           for(int j = 0; j < grid[0].length; j++){
               if(grid[i][j] == 1){
                   max = Math.max(max,dfs(grid,i,j));
                   
               }
           }
       }
       return max;

    }


    public int dfs(int[][] grid,int row,int col){
        
        if(row >= 0  && row < grid.length && col >= 0 && col < grid[0].length && grid[row][col] == 1){
          grid[row][col] = 0;
          return 1 + dfs(grid,row + 1,col) + dfs(grid,row - 1,col) + dfs(grid,row,col + 1) + dfs(grid,row,col - 1);
        }
        return 0;
       
    }
}
