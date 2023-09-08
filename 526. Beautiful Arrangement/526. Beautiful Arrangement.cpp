class Solution {
public:
    
    int countArrangement(int n) {
        if(n == 0) return 0;
        vector<int> used(n + 1, 0);
        return solve(n, 1, used); 
    }

    int solve(int n, int index, vector<int> used){

        if(index > n){
            return 1;
        }
        int count = 0;
        for(int i = 1; i <= n; i++){
            if(used[i] == 0 && (i % index == 0 || index % i == 0)){
                used[i] = 1;
                count += solve(n, index + 1, used);
                used[i] = 0;
            }
        }

        return count;
    }
};
