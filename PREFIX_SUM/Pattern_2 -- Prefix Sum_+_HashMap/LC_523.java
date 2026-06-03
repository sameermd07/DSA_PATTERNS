class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        HashMap<Integer,Integer>hm=new HashMap<>();
        hm.put(0,-1);
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            int req=sum%k;
            if(hm.containsKey(req)){
                if(i-hm.get(req)>=2){
                    return true;
                }
            }else{
                hm.put(req,i);
            }
        }
        return false;
    }
}