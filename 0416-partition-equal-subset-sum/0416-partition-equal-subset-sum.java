class Solution {
    Boolean dp[][];
    public boolean canPartition(int[] nums) {
        int check=0;
        for(int i:nums){
            check+=i;
        }
        if(check%2!=0) return false;
        dp=new Boolean[nums.length+1][check/2+1];
        return helper(0,0,check/2,nums);
    }
    public boolean helper(int i,int sum,int target,int nums[]){
        if(sum>target){
            return false;
        }
        if(sum==target) return true;
        if(i==nums.length) return false;
        if(dp[i][sum]!=null){
            return dp[i][sum];
        }
        boolean left=helper(i+1,sum+nums[i],target,nums);
        boolean right=helper(i+1,sum,target,nums);
        return dp[i][sum]=left||right;
    }
}