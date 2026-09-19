class Solution {
    public int maxArea(int[] h) {
        int n=h.length;
        int ans=0;
        for(int i=n-1;i>0;i--){
            for(int j=0;j<=i;j++){
                int c=Math.min(h[i],h[j])*(i-j);
                ans=Math.max(c,ans);
            }
        }
        return ans;
    }
}
