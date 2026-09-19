class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i:nums){
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        PriorityQueue<int[]> pq=new PriorityQueue<>((x,y)->{
                if(x[1]<y[1]) return 1;
                else if(x[1]>y[1]) return -1;
                else return 0;
        });
        for(int i:hm.keySet()){
            pq.add(new int[]{i,hm.get(i)});
        }
        int[] ans=new int[k];
        for(int i=0;i<k;i++){
            int[] q=pq.poll();
            ans[i]=q[0];
        }
        return ans;
    }
}
