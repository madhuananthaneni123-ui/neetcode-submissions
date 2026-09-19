class Solution {
    public int evalRPN(String[] t) {
        Stack<Integer> s=new Stack<>();
        for(int i=0;i<t.length;i++){
            String w=t[i];
            try{
                s.push(Integer.parseInt(w));
            }
            catch(Exception e){
                int a=s.pop();
                int b=s.pop();
                switch(w){
                    case "+":{
                        s.push(b+a);
                        break;}
                    case "-":{
                        s.push(b-a);
                        break;}
                    case "*":{
                        s.push(b*a);
                        break;}
                    case "/":{
                        s.push(b/a);
                        break;}
                }
            }
        }
        return s.pop();
    }
}
