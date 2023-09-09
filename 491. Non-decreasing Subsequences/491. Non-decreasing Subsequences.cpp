class Solution {
public:
    vector<vector<int>> findSubsequences(vector<int>& nums) {
        vector<vector<int>> ans;
        vector<int> seq;
        dfs(ans, seq, nums, 0);
        return ans;
    }

    void dfs(vector<vector<int>>&ans, vector<int>&seq, vector<int>&nums, int index){

        if(seq.size() > 1) ans.push_back(seq);
        unordered_set<int> set;
        for(int i = index; i < nums.size(); i++){
            if((seq.empty() || nums[i] >= seq.back()) && set.find(nums[i]) == set.end()){
                seq.push_back(nums[i]);
                dfs(ans, seq, nums, i + 1);
                seq.pop_back();
                set.insert(nums[i]);
            }
        }
    }
};
