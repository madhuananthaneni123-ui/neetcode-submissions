class Solution {
    public int search(int[] n, int t) {
        int ans=-1;
        int low=0;
        int high=n.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(n[mid]==t) return mid;
            else if(n[low]<=n[mid]){
                if(n[low]<=t &&n[mid]>t) high=mid-1;
                else low=mid+1;
            }
            else{
                if(n[mid]<t &&n[high]>=t) low=mid+1;
                else high=mid-1;
            }
        }
        return ans;
    }
}
