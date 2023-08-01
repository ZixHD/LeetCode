class Solution {
    public int numIslands(char[][] grid) {
        int count=0;

        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j]=='1'){
                    count++;
                    dfs(grid,i,j);
                }
                
            }
        }
        return count;
    }

    public void dfs(char grid[][],int row,int col){
        if(row<0 || row>=grid.length || col<0 || col>=grid[row].length || grid[row][col]=='0'){
            return;
        }

        grid[row][col]='0';
        dfs(grid,row+1,col);
        dfs(grid,row-1,col);
        dfs(grid,row,col+1);
        dfs(grid,row,col-1);
        return;
    }
}
