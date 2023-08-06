class Solution {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        
        List<Boolean> ans = new ArrayList<>();
        for(int i = 0; i<l.length;i++){
            int start = l[i];
            int end = r[i];
            List<Integer> temp = new ArrayList<>();
            for(int j = start; j < end + 1; j++){
                temp.add(nums[j]);
            }
            ans.add(check(temp));
        }

        return ans;


    }

    public boolean check(List<Integer> list){
        if(list.size() < 2) return false;
        Collections.sort(list);
        int razlika = list.get(1) - list.get(0);
        for(int i = 0; i < list.size() - 1; i++){
            if(list.get(i+1) - list.get(i)!=razlika){
                return false;
            }
        }
        return true;
    }
}
