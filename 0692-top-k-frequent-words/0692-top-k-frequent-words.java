class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String,Integer>hm=new HashMap<>();
        for(String word:words){
            hm.put(word,hm.getOrDefault(word,0)+1);
        }
        PriorityQueue<String>pq=new PriorityQueue<>((a,b)->{
            int f1=hm.get(a);
            int f2=hm.get(b);
            if(f1!=f2){
                return Integer.compare(f1,f2);
            }else{
                return b.compareTo(a);
            }
        });
        for(String key:hm.keySet()){
            pq.offer(key);
            if(pq.size()>k){
                pq.poll();
            }
        }
        List<String>ans=new ArrayList<>();
        while(!pq.isEmpty()){
            ans.add(pq.poll());
        }
        Collections.reverse(ans);
        return ans;
    }
}