class Solution {
    public int[] finalPrices(int[] prices) {
        Stack<Integer> stack = new Stack<>();
        int n = prices.length;
        int[] ans = new int[n];
        for(int i = n -1; i >= 0; i--){
            while(!stack.isEmpty() && prices[stack.peek()] > prices[i]){
                stack.pop();
            }
            
            ans[i] = prices[i] - (stack.size() > 0 ? prices[stack.peek()] : 0);
            stack.push(prices[i]);y
        }

        return ans;
    }
    
}
