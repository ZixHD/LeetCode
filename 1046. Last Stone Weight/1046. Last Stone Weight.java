class Solution {
    public int lastStoneWeight(int[] stones) {
      PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
      for(int i: stones){
          pq.add(i);
      }  

       int first=0,second=0;
       while(pq.size() > 1){
           first = pq.poll();
           second = pq.poll();
           if(first > second){
               pq.offer(first - second);
           }
       }

      return pq.isEmpty() ? 0 : pq.poll();
    }
}
