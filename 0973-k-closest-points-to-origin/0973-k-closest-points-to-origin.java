class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]>pq=new PriorityQueue<>((a,b)->{
            return b[2]-a[2];
        });

        for(int i=0;i<points.length;i++){
            int dist=(points[i][0])*(points[i][0])+(points[i][1])*(points[i][1]);
            pq.offer(new int[]{points[i][0],points[i][1],dist});
            if(pq.size()>k) pq.poll();
        }
        int ans[][]=new int[pq.size()][2];
        int i=0;
        for(int [] arr:pq){
            ans[i][0]=arr[0];
            ans[i][1]=arr[1];
            i++;
        }
        return ans;
    }
}


// 5,2,7,10,3,1

