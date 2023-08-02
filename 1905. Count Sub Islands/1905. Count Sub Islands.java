class Solution {
    int ans=0;
    public int countSubIslands(int[][] grid1, int[][] grid2) {
    int count = 0;
    for(int r=0; r<grid2.length; r++){
        for(int c=0; c<grid2[0].length ; c++){
            if(grid2[r][c] == 1){
                ans=1;
                dfs(grid2,grid1,r,c);
                count+=ans;
            }
        }
    }
    return count;
}

private void dfs(int[][] grid2, int[][] grid1, int r, int c){
    if(r < 0 || r >= grid1.length || c < 0 || c >= grid1[0].length || grid2[r][c] == 0) return;
    if(grid1[r][c]==0) ans=0;
    grid2[r][c] = 0;
    
    dfs(grid2, grid1, r-1, c);
    dfs(grid2, grid1, r+1, c);
    dfs(grid2, grid1, r, c-1);
    dfs(grid2, grid1, r, c+1);
      
}
}
