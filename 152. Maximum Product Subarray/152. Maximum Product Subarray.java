class Solution {
    public int maxProduct(int[] nums) {
        
        int left = 1, right = 1;
        int ans = nums[0];
        for(int i = 0; i < nums.length; i++){
            left *= nums[i];
            right *= nums[nums.length - i - 1];
            ans = Math.max(ans, Math.max(left, right));
            if(left == 0) left = 1;
            if(right == 0) right = 1;
        }

        return ans;
    }
}
