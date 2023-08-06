class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int suma=0;
        for(int i=0;i<nums.length-1;i+=2){
            suma+=nums[i];
        }

        return suma;
    }
}
