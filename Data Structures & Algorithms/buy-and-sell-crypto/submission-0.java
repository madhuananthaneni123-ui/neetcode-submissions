class Solution {
    public int maxProfit(int[] p) {
        int n=p.length;
        int[] suf=new int[n];
        suf[n-1]=p[n-1];
        for(int i=n-2;i>=0;i--){
            suf[i]=Math.max(suf[i+1],p[i]);
        }
        int ans=0;
        for(int i=0;i<n;i++){
            int c=suf[i]-p[i];
            ans=Math.max(c,ans);
        }
        return ans;
    }
}
