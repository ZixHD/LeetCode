class Solution {
    public int closedIsland(int[][] grid) {
        
        int ans=0;
        for(int i =0;i<grid.length;i++){
            for(int j = 0;j<grid[0].length;j++){
                if(grid[i][j]==0 && dfs(grid,i,j)==0){
                    ans++;
                }
            }
        }
        return ans;
    }



    public int dfs(int[][] grid,int i,int j){

       if(i<0 || i>=grid.length || j<0 || j>=grid[0].length){
           return 1;
       }

       if(grid[i][j]==1){
           return 0;
       }
       grid[i][j]=1;
       return dfs(grid,i + 1,j) | dfs(grid,i - 1,j) | dfs(grid,i,j + 1) | dfs(grid,i,j - 1);
    }
}
