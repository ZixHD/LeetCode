class Solution {
    public int findNonMinOrMax(int[] nums) {
        
        Arrays.sort(nums);
        return nums.length > 2 ? nums[1] : -1;
    }
}
