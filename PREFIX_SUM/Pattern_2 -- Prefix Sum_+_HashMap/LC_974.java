class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        mp.put(0,1);
        int currSum=0;
        int cnt=0;
        for(int i=0;i<nums.length;i++){
            currSum+=nums[i];
            int rem=currSum%k;
            if(rem<0){
                rem=rem+k;
            }
            if(mp.containsKey(rem)){
                cnt+=mp.get(rem);
                mp.put(rem,mp.get(rem)+1);
            }else{
                mp.put(rem,1);
            }
        }
        return cnt;
    }
}