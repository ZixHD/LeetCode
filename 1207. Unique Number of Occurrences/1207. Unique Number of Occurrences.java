class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i : arr){
            map.put(i,map.getOrDefault(i,0) + 1);
        }

        Set<Integer> seen = new HashSet<>();
        for(int n : map.values()){
            if(seen.contains(n)){
                return false;
            }
            else seen.add(n);
        }

        return true;
    }
}
