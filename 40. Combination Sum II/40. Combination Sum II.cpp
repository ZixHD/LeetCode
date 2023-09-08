class Solution {
public:
    vector<vector<int>> combinationSum2(vector<int>& candidates, int target) {
        
        vector<vector<int>> ans;
        sort(candidates.begin(), candidates.end());
        vector<int> local;
        solve(ans, candidates, target, 0, local);
        return ans;
    }

    void solve(vector<vector<int>>&ans, vector<int>&candidates, int target, int index, vector<int>&local){

        if(target == 0){
            ans.push_back(local);
            return;
        }
        else{
        for(int i = index; i < candidates.size(); i++){
            if(candidates[i] > target) return;
            if(i && candidates[i] == candidates[i - 1] && i > index) continue;
            local.push_back(candidates[i]);
            solve(ans, candidates, target - candidates[i], i + 1, local);
            local.pop_back();
         }
        }
    }
};
