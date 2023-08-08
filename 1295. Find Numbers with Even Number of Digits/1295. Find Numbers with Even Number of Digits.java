class Solution {
    public int findNumbers(int[] nums) {
        
        int ans = 0;
        for(int n : nums){
            if(check(n) % 2 == 0) {
                ans++;
            }
        }
        return ans;
    }

    public int check(int num){

        int count = 0;
        while(num>0){
            num/=10;
            count++;
        }

        return count;
    }
}
