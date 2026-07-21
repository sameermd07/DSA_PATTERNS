class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        return helper(0,nums,target,0,nums.length);
    }
    public int helper(int i,int nums[],int target,int sum,int n){
        if(i>n) return 0;
        if(i==n){
            if(sum==target){
                return 1;
            }else{
                return 0;
            }
        }
        int left=helper(i+1,nums,target,sum+nums[i],n);
        int right=helper(i+1,nums,target,sum-nums[i],n);
        return left+right;
    }
}