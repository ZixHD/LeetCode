class Solution {
    public int heightChecker(int[] heights) {
        
        int[] ans = heights.clone();
        Arrays.sort(ans);
        int count = 0;
        for(int i = 0; i < heights.length; i++){
            if(heights[i]!=ans[i])
                count++;
        }

        return count;
    }
}
