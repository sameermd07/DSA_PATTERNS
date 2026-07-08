class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        PriorityQueue<int[]>pq=new PriorityQueue<>((a,b)->{
            if(a[0]!=b[0]){
                return b[0]-a[0];
            }
            return b[1]-a[1];
        });
        for(int i=0;i<mat.length;i++){
            int cnt=0;
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==1) cnt++;
            }
            pq.offer(new int[]{cnt,i});
            if(pq.size()>k) pq.poll();
        }
        int arr[]=new int[k];
        for(int i=0;i<k;i++){
            arr[k-i-1]=pq.poll()[1];
        }
        return arr;
    }
}