class Solution {
    public int maxProductDifference(int[] nums) {
      Arrays.sort(nums);
      int firstPair = nums[0] * nums[1];
      int secondPair= nums[nums.length - 2] * nums[nums.length - 1];
      return secondPair - firstPair;
    }
}
