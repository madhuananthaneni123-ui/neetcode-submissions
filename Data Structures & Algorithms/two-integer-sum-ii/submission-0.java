class Solution {
    public int[] twoSum(int[] num, int t) {
        int n=num.length;
        int i=0,j=n-1;
        while(i<j){
            int sum=num[i]+num[j];
            if(sum==t) return new int[]{i+1,j+1};
            else if(sum>t) j--;
            else i++;
        }
        return new int[]{0,0};
    }
}
