class KthLargest {
    PriorityQueue<Integer>pq;
    int kth;
    public KthLargest(int k, int[] nums) {
        kth=k;
        pq=new PriorityQueue<>();
        for(int i:nums){
            pq.offer(i);
            if(pq.size()>k) pq.poll();
        }
    }
    
    public int add(int val) {
        pq.offer(val);
        if(pq.size()>kth) pq.poll();
        // System.out.println(pq);
        return pq.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */