class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        
        int ans[] = new int[nums.length];
        for(int i = 0;i<nums.length;i++){
            ans[i] = provera(nums,nums[i]);
        }
        return ans;
    
   
   }
    public int provera(int[] nums,int num){
        
        int count=0;
        for(int i =0;i<nums.length;i++){
            if(num>nums[i]){
                count++;
            }
        }
        return count;
    }
}
