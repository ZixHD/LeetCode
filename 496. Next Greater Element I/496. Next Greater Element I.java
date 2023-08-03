class Solution {
    public int[] nextGreaterElement(int[] findNums, int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();
        int[] ans = new int[findNums.length];
        
        for(int num:nums){
            while(!stack.isEmpty() && num > stack.peek()){
                map.put(stack.pop(),num);
            }
            stack.push(num);
        }

        int index=0;
        for(int num : findNums){
            ans[index++] = map.getOrDefault(num,-1);
        }

        return ans;
    }
}
