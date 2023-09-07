class Solution {
public:
    vector<string> letterCombinations(string digits) {
        if(digits.empty()){
            return {};
        }
       vector<string> val = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        vector<string> ans;
        string temp;
        solve(digits, ans, temp, val, 0);
        return ans;
    }

    void solve(string digits, vector<string> &v, string &temp, vector<string>&pad, int index){

        if(index == digits.size()){
           v.push_back(temp);
            return;
        }

        string value = pad[digits[index] - '0'];
        for(int i = 0; i < value.size(); i++){
           temp.push_back(value[i]);
           solve(digits, v, temp, pad, index + 1);
           temp.pop_back();
        }


    }
};
