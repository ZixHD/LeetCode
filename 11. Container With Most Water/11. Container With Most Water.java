class Solution {
    public int maxArea(int[] height) {
        
        int ans = 0, left = 0, right = height.length - 1, res = 0;
        while(left < right){
            if(height[left] <= height[right]){
                res = height[left] * (right - left);
                left++;
            }else{
                res = height[right] * (right - left);
                right--;
            }

            if(res > ans) ans = res;
        }

        return ans;
    }
}
