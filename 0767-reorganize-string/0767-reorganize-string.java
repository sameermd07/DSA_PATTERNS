class Solution {
    public String reorganizeString(String s) {
        int ch[]=new int[26];
        for(char c:s.toCharArray()){
            ch[c-'a']++;
        }
        StringBuilder str=new StringBuilder();
        PriorityQueue<int[]>pq=new PriorityQueue<>((a,b)->{
            return b[1]-a[1];
        });
        for(int i=0;i<26;i++){
            if(ch[i]!=0){
                pq.offer(new int[]{i,ch[i]});
            }
        }
        while(pq.size()>=2){
            int[] arr1=pq.peek();
            pq.remove();
            int[] arr2=pq.peek();
            pq.remove();
            System.out.println((char)(arr1[0]+'a'));
            str.append((char)(arr1[0]+'a'));
            str.append((char)(arr2[0]+'a'));
            if(arr1[1]-1!=0){
                pq.offer(new int[]{arr1[0],arr1[1]-1});
            }
            if(arr2[1]-1!=0){
                pq.offer(new int[]{arr2[0],arr2[1]-1});
            }
        }
        if(!pq.isEmpty()){
            int last[]=pq.peek();
            if(last[1]!=1){
                return "";
            }else{
                str.append((char)(last[0]+'a'));
            }
        }
        return str.toString();
    }
}