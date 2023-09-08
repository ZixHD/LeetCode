class Solution {
    public int maxUniqueSplit(String s) {
        Set<String> set = new HashSet<>();
        return solve(set, 0, s);
    }


    public int solve(Set<String> set, int index, String s){
        if(index >= s.length()) return 0;
        int res = -1;
        for(int i = index + 1; i <= s.length(); i++){
            String sub = s.substring(index, i);
            if(!set.add(sub)) continue;
            int next = solve(set, i, s);
            if(next >= 0) res = Math.max(res, next + 1);
            set.remove(sub);
        }

        return res;
    }
}
