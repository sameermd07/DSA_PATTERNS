class Solution {
    public int leastInterval(char[] tasks, int n) {
        int ch[]=new int[26];
        for(char i:tasks){
            ch[i-'A']++;
        }
        PriorityQueue<Integer>pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i:ch){
            if(i!=0){
                pq.offer(i);
            }
        }
        int cnt=0;
        while(!pq.isEmpty()){
            ArrayList<Integer>nums=new ArrayList<>();
            for(int i=0;i<n+1;i++){
                if(!pq.isEmpty()){
                    int curr=pq.poll();
                    curr--;
                    nums.add(curr);
                }
            }
            for(int i:nums){
                if(i!=0) pq.offer(i);
            }
            if(pq.isEmpty()){
                cnt+=nums.size();
            }else{
                cnt+=(n+1);
            }

        }
        return cnt;
    }
}