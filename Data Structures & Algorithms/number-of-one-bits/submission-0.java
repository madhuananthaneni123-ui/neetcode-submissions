class Solution {
    public int hammingWeight(int n) {
        int cnt=0;
        while(n!=0){
            int a=n&1;
            if(a==1) cnt++;
            n>>=1;
        }
        return cnt;
    }
}
