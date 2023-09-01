class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        
        int diff = 0, totalDiff = 0;
        int ans = 0;
        for(int i = 0; i < gas.length; i++){
            diff += gas[i] - cost[i];
            totalDiff += gas[i] - cost[i];
            if(diff < 0){
                diff = 0;
                ans = i + 1;
            }
        }

        return (totalDiff < 0) ? -1 : ans;
    }
}
