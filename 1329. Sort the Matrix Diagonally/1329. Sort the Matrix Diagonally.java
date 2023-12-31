class Solution {
    public int[][] diagonalSort(int[][] mat) {
       
       int n  = mat.length,m=mat[0].length;

       HashMap<Integer,PriorityQueue<Integer>> map  =new HashMap<>();
       for(int i = 0;i<n;i++){
           for(int j = 0;j<m;j++){
               map.putIfAbsent(i-j,new PriorityQueue<>());
               map.get(i-j).add(mat[i][j]);
           }
       }

       for(int i = 0;i<n;i++){
           for(int j = 0;j<m;j++){
               mat[i][j] = map.get(i-j).poll();
           }
       }

       return mat;
    }

}
