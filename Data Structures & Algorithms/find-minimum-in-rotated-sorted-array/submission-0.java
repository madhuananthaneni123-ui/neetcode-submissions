class Solution {
    public int findMin(int[] n) {
        int low=0;
        int high=n.length-1;
        while(low<high){
            int mid=(low+high)/2;
            if(n[low]<n[mid] && n[mid]<n[high]) return n[low];
            if(n[mid]<n[high]) high=mid;
            else low=mid+1;
        }
        return n[low];
    }
}
