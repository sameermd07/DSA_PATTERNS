class Solution {
    public int[] leftRightDifference(int[] nums) {
        int l[]=new int[nums.length];
        int r[]=new int[nums.length];
        int ans[]=new int[nums.length];
        int sum=0;
        for(int i=0;i<nums.length;i++){
            l[i]=sum;
            sum+=nums[i];
        }
        sum=0;
        for(int i=nums.length-1;i>=0;i--){
            r[i]=sum;
            sum+=nums[i];
        }
        for(int i=0;i<nums.length;i++){
            ans[i]=Math.abs(l[i]-r[i]);
        }
        return ans;
    }
}