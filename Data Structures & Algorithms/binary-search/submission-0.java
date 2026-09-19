class Solution {
    public int search(int[] nums, int t) {
        int i=0,j=nums.length-1;
        while(i<=j){
            int mid=(i+j)/2;
            if(nums[mid]==t) return mid;
            else if(nums[mid]>t) j=mid-1;
            else i=mid+1;
        }
        return -1;
    }
}
