class Solution {
    public boolean isValid(String s1) {
        Stack<Character> s=new Stack<>();
        for(int i=0;i<s1.length();i++){
            char c=s1.charAt(i);
            if(c=='['||c=='{'||c=='(') s.push(c);
            else{
                if(s.isEmpty()) return false;
                if(s.peek()=='['){
                    if(c==']') s.pop();
                    else return false;
                }
                else if(s.peek()=='{'){
                    if(c=='}') s.pop();
                    else return false;
                }
                else{
                    if(c==')') s.pop();
                    else return false;
                }
            }
        }
        return s.isEmpty();
    }
}
