class Solution {
    public boolean searchMatrix(int[][] m, int t) {
        int r=m.length;
        int c=m[0].length;
        for(int i=0;i<r;i++){
            int low=0;
            int high=c-1;
            while(low<=high){
                int mid=(low+high)/2;
                if(m[i][mid]==t) return true;
                else if(m[i][mid]>t) high=mid-1;
                else low=mid+1;
            }
        }
        return false;
    }
}
