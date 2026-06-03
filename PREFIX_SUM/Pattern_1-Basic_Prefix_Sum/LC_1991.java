class Solution {
    public int findMiddleIndex(int[] nums) {
        int rightSum=0;
        int leftSum=0;
        for(int num:nums){
            rightSum+=num;
        }
        //note pivot index can be 0,1,2,...n-2;
        //while left to right will consider ith idx as pivot and leftSum==rightSum-pivot then i is the answer else update leftsum
        for(int i=0;i<nums.length;i++){
            if(rightSum-nums[i]-leftSum==leftSum){
                return i;
            }
            leftSum+=nums[i];
        }
        return -1;
    }
}