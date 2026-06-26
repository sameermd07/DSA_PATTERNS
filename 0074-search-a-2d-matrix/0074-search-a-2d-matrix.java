class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int low=0,high=matrix[0].length-1;
        int rowIdx=findRow(matrix,matrix[0].length-1,target);
        System.out.println(rowIdx);
        if(rowIdx==-1) return false;
        while(low<=high){
            int mid=(low+high)/2;
            if(matrix[rowIdx][mid]==target){
                return true;
            }else if(matrix[rowIdx][mid]>target){
                high=mid-1;
            }else{
                System.out.println("hello");
                low=mid+1;
            }
        }
        return false;
    }
public int findRow(int[][] matrix, int colIndex, int key) {
    int low = 0;
    int high = matrix.length - 1;
    int ans = -1;
    while (low <= high) {
        int mid = low + (high - low) / 2;
        if (matrix[mid][colIndex] == key) {
            return mid; 
        } else if (matrix[mid][colIndex] > key) {
            ans=mid;
            high = mid - 1;
        } else {
            low = mid + 1;
        }
    }
    return ans;
}
}