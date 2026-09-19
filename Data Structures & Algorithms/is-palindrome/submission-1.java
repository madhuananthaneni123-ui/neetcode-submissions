class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(Character.isLetter(c)|| Character.isDigit(c)){
                ans.append(c);
            }
        }
        String q=ans.toString().toLowerCase();
        int n=q.length();
        for(int i=0;i<n/2;i++){
            if(q.charAt(i)!=q.charAt(n-i-1)) return false;
        }
        return true;
    }
}
