class Solution {
    public int getMaximumGold(int[][] grid) {
        
        int n = grid.length;
        int m = grid[0].length;
        int maxGold = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                maxGold = Math.max(maxGold, dfs(grid, i, j, n, m));
            }
        }

        return maxGold;
    }

    int[] dx = new int[]{-1, 1, 0, 0};
    int[] dy = new int[]{0, 0, -1, 1};
    public int dfs(int[][] grid, int i, int j, int n, int m){

        if(i < 0 || i >= n || j < 0 || j >= m || grid[i][j] == 0){
            return 0;
        }

        int temp = grid[i][j];
        grid[i][j] = 0;
        int maxGold = 0;
        for(int k = 0; k < 4; k++){
            int x = i + dx[k];
            int y = j + dy[k];
            maxGold = Math.max(maxGold, dfs(grid, x, y, n, m));
        }
        grid[i][j] = temp;
        return temp + maxGold;


    }
}
