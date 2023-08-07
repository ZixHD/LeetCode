class Solution {
    public int[] findBall(int[][] grid) {
        
        int n = grid[0].length;
        int[] ans = new int[n];

        for(int j = 0; j < n; j++){
            ans[j] = dfs(grid, 0, j);
        }

        return ans;
    }

    public int dfs(int[][] grid, int i, int j){
        
        if(i==grid.length){
            return j;
        }

        if(grid[i][j] == 1 && j + 1 < grid[0].length && grid[i][j + 1] == 1){
           return dfs(grid, i + 1, j + 1);
        }
        else if(grid[i][j] == -1 && j - 1 >= 0 && grid[i][j - 1] == -1){
           return dfs(grid , i + 1, j - 1);
        }

        return -1;
    }
}
