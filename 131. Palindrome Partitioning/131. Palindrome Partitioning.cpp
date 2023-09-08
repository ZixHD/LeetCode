class Solution {
public:
    vector<vector<string>> partition(string s) {
        
        vector<vector<string>> ans;
        if(s.empty()) return ans;

        vector<string> path;
        solve(ans, path, s, 0);
        return ans;

    }


    void solve(vector<vector<string>> &ans, vector<string> &path, string &s, int index){
        
        if(index == s.size()){
            ans.push_back(path);
            return;
        }

        for(int i = index; i < s.size(); i++){
            if(isPalindrom(s, index, i)){
                path.push_back(s.substr(index, i - index + 1));
                solve(ans, path, s, i + 1);
                path.pop_back();
            }
        }
        
    }


    bool isPalindrom(string &s, int start, int end){

        while(start <= end){
            if(s[start++] != s[end--]){
                return false;
            }
        }

        return true;
    }
};
