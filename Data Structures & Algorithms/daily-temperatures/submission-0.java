class Solution {
    public int[] dailyTemperatures(int[] t) {
        int n=t.length;
        int[] ans=new int[n];
        Stack<Integer> s=new Stack<>();
        for(int i=0;i<n;i++){
            while(!s.isEmpty() && t[i]>t[s.peek()]){
                int in=s.pop();
                ans[in]=i-in;
            }
            s.push(i);
        }
        return ans;
    }
}
