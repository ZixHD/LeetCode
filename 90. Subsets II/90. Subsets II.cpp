class Solution {
public:
    vector<vector<int>> permuteUnique(vector<int>& nums) {
        
        vector<vector<int>> ans;
        solve(0, nums, ans);
        return ans;
    }

     void solve(int index, vector<int>&nums, vector<vector<int>> &ans){

         if(index == nums.size()){
             ans.push_back(nums);
             return;
         }

         unordered_set<int> set;
         for(int i = index; i < nums.size(); i++){
             if(set.count(nums[i]) == 1) continue;
             set.insert(nums[i]);
             swap(nums[i], nums[index]);
             solve(index + 1, nums, ans);
             swap(nums[i], nums[index]);
         }
     }
};
