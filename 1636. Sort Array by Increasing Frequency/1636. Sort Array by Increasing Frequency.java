class Solution {
    public int[] frequencySort(int[] nums) {
        
        HashMap<Integer,Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for(int i : nums){
            list.add(i);
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        Collections.sort(list, (a, b) ->
        (map.get(a) == map.get(b)) ? b - a : map.get(a) - map.get(b));

        return list.stream().mapToInt(i -> i).toArray();

     
    }
}
