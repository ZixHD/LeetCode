class Solution {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i = 0; i < gifts.length; i++){
            pq.add(gifts[i]);
        }

        for(int i = 0; i < k; i++){
            int temp = pq.poll();
            int sq = (int)Math.sqrt(temp);
            int res = (int)sq;
            pq.add(res);
        }

        long ans=0;
        for(int i = 0; i < gifts.length; i++){
            ans+=pq.poll();
        }

        return ans;
    }
}
