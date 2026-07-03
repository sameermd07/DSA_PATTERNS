class Solution {
    public int lastStoneWeight(int[] stones) {
        if(stones.length==1) return stones[0];
        if(stones.length==0) return 0;
        PriorityQueue<Integer>pq=new PriorityQueue<>((a,b)->{
            return b-a;
        });
        for(int i:stones){
            pq.offer(i);
        }
        while(pq.size()>1){
            int a=pq.poll();
            int b=pq.poll();
            pq.offer(a-b);
        }
        return pq.poll();
    }
}