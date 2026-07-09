class Solution {
    public int minSubArrayLen(int k, int[] nums) {
        int sum=0,min=Integer.MAX_VALUE;
        int i=0,j=0;
        while(j<nums.length){
            sum+=nums[j];
            while(i<=j && sum>=k){
                min=Math.min(j-i+1,min);
                sum-=nums[i];
                i++;
            }
            j++;
        }
        return min==Integer.MAX_VALUE?0:min;
    }
}