class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length==0)return false;

        int n=matrix.length;
        int m= matrix[0].length;

        int low=0,high=(n*m)-1;

        while(low<=high){
            int mid=(low+(high-low)/2);
            int rInd=mid/m;
            int cInd=mid%m;

            if(matrix[rInd][cInd]==target){
                return true;
            }else if(matrix[rInd][cInd]<target){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return false;
    }
}
