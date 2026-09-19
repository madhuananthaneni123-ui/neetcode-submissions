class Solution {
    void sol(int i,List<List<Integer>> li,List<Integer> temp,int[] nums) {
        if(i<0) {
            li.add(new ArrayList<>(temp));
            return;
        }
        temp.add(nums[i]);
        sol(i-1,li,temp,nums);
        temp.remove(temp.size()-1);
        sol(i-1,li,temp,nums);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        sol(nums.length-1,ans,new ArrayList<>(),nums);
        return ans;
    }
}
