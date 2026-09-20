class Solution {
    void sol(int i,List<List<Integer>> li,List<Integer> temp,int sum,int[] nums,int t){
        if(i<0){
            if(sum==t){
                li.add(new ArrayList<>(temp));
            }
            return;
        }
        sol(i-1,li,temp,sum,nums,t);
        if(sum+nums[i]>t) return;
        sum+=nums[i];
        temp.add(nums[i]);
        sol(i,li,temp,sum,nums,t);
        sum-=nums[i];
        temp.remove(temp.size()-1);
      
    }
    public List<List<Integer>> combinationSum(int[] nums, int t) {
        List<List<Integer>> ans=new ArrayList<>();
        sol(nums.length-1,ans,new ArrayList<>(),0,nums,t);
        return ans;
    }
}
