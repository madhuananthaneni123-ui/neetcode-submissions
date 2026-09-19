class Solution {
    static boolean check(int[] p,int k,int h){
        int cnt=0;
        for(int i=0;i<p.length;i++){
            double ans=(double)p[i]/k;
            cnt+=(int)Math.ceil(ans);
        }
        if(cnt<=h) return true;
        return false;
    }
    public int minEatingSpeed(int[] p, int h) {
        int max=0,min=Integer.MAX_VALUE;
        int ans=0;
        for(int i:p) max=Math.max(i,max);
        for(int i:p) min=Math.min(i,min);
        int low=1;
        int high=max;
        while(low<=high){
            int mid=(low+high)/2;
            if(check(p,mid,h)){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
}
