class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer>hs=new HashSet<>();
        for(int i=0;i<nums1.length;i++){
            // if(hs.contains(nums1[i])) break;
            for(int j=0;j<nums2.length;j++){
                if(nums2[j]==nums1[i]){
                    hs.add(nums1[i]);
                    break;
                }
            }
        }
        int idx=0;
        int ans[]=new int[hs.size()];
        for(int i:hs){
            ans[idx++]=i;
        }
        return ans;
    }
}