class Solution {
    public int singleNumber(int[] nums) {
        int e=0;
        for(int i:nums){
            e^=i;
        }
        return e;
    }
}
