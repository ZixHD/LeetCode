class Solution {
public:
    int ans = INT_MAX;
    int distributeCookies(vector<int>& cookies, int k) {

        vector<int>v(k, 0);
        solve(cookies, k, v, 0);
        return  ans;
    }

    void solve(vector<int>&cookie, int k, vector<int>&v, int index){

        if(index == cookie.size()){
            int maxm = INT_MIN;
            for(int i = 0; i < k; i++){
                maxm = max(maxm, v[i]);
            }
            ans = min(ans, maxm);
            return;
        }

        for(int i = 0; i < k; i++){
            v[i] += cookie[index];
            solve(cookie, k, v, index + 1);
            v[i] -= cookie[index];
        }
    }
};
