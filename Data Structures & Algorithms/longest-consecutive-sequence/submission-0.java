class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;
        HashSet<Integer> h=new HashSet<>();
        for(int i:nums){
            h.add(i);
        }
        int ans=1;
        for(int i=0;i<nums.length;i++){
            int e=nums[i];
            if(h.contains(nums[i]+1)){
                if(!h.contains(nums[i]-1)){
                    int cnt=0;
                    while(h.contains(e)){
                        cnt++;
                        e++;
                    }
                    ans=Math.max(ans,cnt);
                }
            }
        }
        return ans;
    }
}
