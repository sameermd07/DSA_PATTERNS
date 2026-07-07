class Solution {
    public int nthUglyNumber(int n) {
        // Use Long to avoid integer overflow
        PriorityQueue<Long> pq = new PriorityQueue<>();
        int arr[] = new int[]{2, 3, 5};
        
        pq.offer(1L);
        HashSet<Long> hs = new HashSet<>();
        hs.add(1L);
        
        long curr = 1;
        // Run the loop exactly n times to poll the nth ugly number
        for (int i = 0; i < n; i++) {
            curr = pq.poll(); // The i-th smallest element
            
            for (int num : arr) {
                long ele = num * curr;
                if (!hs.contains(ele)) {
                    hs.add(ele);
                    pq.offer(ele);
                }
            }
        }
        
        return (int) curr; // Cast back to int at the very end
    }
}