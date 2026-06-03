class Solution {
    public int[] runningSum(int[] nums) {
     int arr[]=new int[nums.length];
     int j=0;
     int SUM=0;
     for(int i:nums){
        sum+=i;
        arr[j]=sum;
        j++;
     }   
     return arr;
    }
}