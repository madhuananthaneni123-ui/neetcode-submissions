class Solution {
    public int[] countBits(int n) {
        int[] ans= new int[n+1];
        for(int i=0;i<=n;i++){
            int res=0;
            int r=i;
            while(r!=0){
                r=r&(r-1);
                res++;
            }
            ans[i]=res;
        }
        return ans;
    }
}
