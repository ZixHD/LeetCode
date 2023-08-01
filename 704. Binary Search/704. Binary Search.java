class Solution {
    public int search(int[] nums, int target) {
        
    int left=0,right=nums.length-1;

    while(left<right){
        int mid = left + (right-left+1)/2;
        if(target<nums[mid]){
            right=mid-1;
        }else left=mid;
    }

    return nums[left]==target? left: -1;

    }
}
