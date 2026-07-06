class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        PriorityQueue<int []>pq=new PriorityQueue<>((a,b)->{
            if(a[1]==b[1]){
                return (b[0]-a[0]);
            }else{
                return (b[1]-a[1]);
            }
        });
        for(int i:arr){
            int diff;
            diff=Math.abs(i-x);
            // int ele=i;
            pq.offer(new int[]{i,diff});
            if(pq.size()>k) pq.poll();
        }
        System.out.println(pq);
        List<Integer>nums=new ArrayList<>();
        while(!pq.isEmpty()){
            nums.add(pq.poll()[0]);
        }
        Collections.sort(nums);
        return nums;
    }
}