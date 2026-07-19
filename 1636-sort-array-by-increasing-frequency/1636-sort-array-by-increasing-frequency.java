class Solution {
    public int[] frequencySort(int[] nums) {
        PriorityQueue<int []>pq=new PriorityQueue<>((a,b)->{
            if(a[1]!=b[1]) return a[1]-b[1];
            return b[0]-a[0];
        });
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i:nums){
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        for(int key:hm.keySet()){
            pq.offer(new int[]{key,hm.get(key)});
        }
        int idx=0;
        while(!pq.isEmpty()){
            int curr[]=pq.poll();
            for(int i=0;i<curr[1];i++){
                nums[idx++]=curr[0];
            }
        }
        return nums;
    }
}