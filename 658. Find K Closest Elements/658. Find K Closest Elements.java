class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        
        List<Integer> list = new ArrayList<>(k);
        int left = 0,right = arr.length-k;
        while(left<right){
            int mid = left + (right-left)/2;
            if(x - arr[mid] > arr[mid + k] - x){        // provera za jedan manji i jedan veci od trenutnog mida
                left = mid + 1;
            }
            else {
                right = mid;
            }
        }
        for(int i = left; i < left + k; i++){
            list.add(arr[i]);
        }
        return list;
    }
}
