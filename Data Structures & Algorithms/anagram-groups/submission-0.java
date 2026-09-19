class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans=new ArrayList<>();
        int n=strs.length;
        String[] du=new String[n];
        int[] vi=new int[n];
        for(int i=0;i<n;i++){
            String a=strs[i];
            char[] c=a.toCharArray();
            Arrays.sort(c);
            String w=new String(c);
            du[i]=w;
        }
        for(int i=0;i<n;i++){
            if(vi[i]==0){
                List<String> li=new ArrayList<>();
                li.add(strs[i]);
                vi[i]=-1;
                for(int j=0;j<n;j++){
                    if(vi[j]==0){
                        if(du[i].equals(du[j])){
                            li.add(strs[j]);
                            vi[j]=-1;
                        }
                    }
                }
                ans.add(li);
            }
        }
        return ans;
    }
}
