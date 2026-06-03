class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        HashMap<Integer,Integer>mp=new HashMap<>();
        int sum=0;
        int cnt=0;
        mp.put(0,1);
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2!=0){
                sum++;
            }
            if(mp.containsKey(sum-k)){
                cnt+=mp.get(sum-k);
            }
            mp.put(sum,mp.getOrDefault(sum,0)+1);
        }
        return cnt;
    }
}