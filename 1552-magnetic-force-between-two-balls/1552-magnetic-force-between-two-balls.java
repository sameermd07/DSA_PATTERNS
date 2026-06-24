class Solution {
    public int maxDistance(int[] nums, int m) {
        Arrays.sort(nums);
        int low=1,high=nums[nums.length-1],ans=-1;
        while(low<=high){
            int mid=(high-low)/2+low;
            if(isValid(nums,mid,m)){
                ans=mid;
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return ans;
    }
        public boolean isValid(int nums[],int mid,int k){
        int cnt=1;
        int lastIdx=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]-nums[lastIdx]>=mid){
                cnt++;
                lastIdx=i;
            }
        }
        if(cnt>=k){
            return true;
        }
        return false;
    }
}