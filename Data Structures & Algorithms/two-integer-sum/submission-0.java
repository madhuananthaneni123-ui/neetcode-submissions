class Solution {
    public int[] twoSum(int[] nums, int t) {
        HashMap<Integer,Integer> hm= new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int q=t-nums[i];
            if(hm.containsKey(q)){
                return new int[]{hm.get(q),i};
            }
            hm.put(nums[i],i);
        }
        return new int[]{0,0};
    }
}
