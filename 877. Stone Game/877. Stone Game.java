class Solution {
    public boolean stoneGame(int[] piles) {
        
        Arrays.sort(piles);
        int left = 0, right = piles.length - 1;
        int alice = 0, bob = 0;
        while(left <= right){
            bob += piles[left++];
            alice += piles[right--];
        }

        return alice > bob ? true : false;
    }
}
