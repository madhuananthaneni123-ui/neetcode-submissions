class Solution {
    public boolean isAnagram(String s, String t) {
            int[] a=new int[26];
            if(s.length()!=t.length()) return false;
            for(int i=0;i<s.length();i++){
                char c=s.charAt(i);
                char w=t.charAt(i);
                a[c-'a']++;
                a[w-'a']--;
            }
            for(int i=0;i<26;i++){
                if(a[i]!=0) return false;
            }
            return true;
    }
}
