class Solution {
public:
    int minPathSum(vector<vector<int>>& grid) {
        int m = grid.size();
        int n = grid[0].size();
        vector<vector<int>> dp(m, vector<int>(n, -1));
        return solve(grid, 0, 0, dp);
    }

    int solve(vector<vector<int>>&grid, int i, int j, vector<vector<int>>&dp){
        int m = grid.size();
        int n = grid[0].size();

        if(dp[i][j] != -1) return dp[i][j];

        if(i == m - 1 && j == n - 1){
            dp[i][j] = grid[i][j];
            return dp[i][j];
        }
        
        int rightSum = INT_MAX;
        int leftSum = INT_MAX;
        if(j < n - 1){
            rightSum = solve(grid, i, j + 1, dp);
        }
        if(i < m - 1){
            leftSum = solve(grid, i + 1, j, dp);
        }

        return dp[i][j] = min(rightSum, leftSum) + grid[i][j];
    }
};
