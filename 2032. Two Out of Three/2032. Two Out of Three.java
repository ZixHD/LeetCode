class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        Set<Integer> set3 = new HashSet<>();
        Set<Integer> set = new HashSet<>();
        for(int n : nums1) {set1.add(n); set.add(n);}
        for(int n : nums2) {set2.add(n); set.add(n);}
        for(int n : nums3) {set3.add(n); set.add(n);}

        List<Integer> ans = new ArrayList<>();
        for(int i : set){
            if(set1.contains(i) && set2.contains(i) || set2.contains(i) && set3.contains(i) || set1.contains(i) && set3.contains(i)) ans.add(i);
        }
        return ans;
    }
}
