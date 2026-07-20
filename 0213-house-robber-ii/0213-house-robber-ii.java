class Solution {
    int dp[];
    public int rob(int[] nums) {
        if(nums.length==1) return nums[0];
        dp=new int[nums.length+1];
        Arrays.fill(dp,-1);
        int x=helper(0,nums,nums.length-1);
        Arrays.fill(dp,-1);
        int y=helper(1,nums,nums.length);
        return Math.max(x,y);
    }
    public int helper(int i,int nums[],int n){
        if(i>=n){
            return 0;
        }
        if(dp[i]!=-1) return dp[i];
        int left=nums[i]+helper(i+2,nums,n);
        int right=helper(i+1,nums,n);
        return dp[i]=Math.max(left,right);
    }
}