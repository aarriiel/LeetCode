// 6 ms, faster than 80.44% 
// 36.1 MB, less than 74.53% 
class Solution {
    public boolean isOpe(String msg){
        if(msg.equals("+")||msg.equals("-")||msg.equals("*")||msg.equals("/"))
            return true;
        return false;
    }
    public int cal(int a,int b,String s){
        switch(s){
            case "+":
                return a+b;
            case "-":
                return a-b;
            case "*":
                return a*b; 
            case "/":
                return a/b;
        }
        return -1;
    }
    public int evalRPN(String[] tokens) {
        int result=0;
        Stack<Integer> stack = new Stack<Integer>();
        for(int i=0;i<tokens.length;i++){
            if(!isOpe(tokens[i]))
                stack.push(Integer.parseInt(tokens[i]));
            else{
                int a=stack.peek();
                stack.pop();
                int b=stack.peek();
                stack.pop();
                result=cal(b,a,tokens[i]);
                stack.push(result);
            }    
        }
        result=stack.peek();
        stack.pop();
        return result;
    }
}