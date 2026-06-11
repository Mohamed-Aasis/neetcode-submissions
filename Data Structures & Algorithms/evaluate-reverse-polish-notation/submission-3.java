class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<tokens.length;i++){
            if(tokens[i].equals("+")){
                int sum=stack.pop()+stack.pop();
                stack.push(sum);
            }
            else if(tokens[i].equals("*")){
                int multi=stack.pop()*stack.pop();
                stack.push(multi);
            }
            else if(tokens[i].equals("-")){
                int num=stack.pop();
                int subtract=stack.pop()-num;
                stack.push(subtract);
            }
            else if(tokens[i].equals("/")){
                int num=stack.pop();
                int div=stack.pop()/num;
                stack.push(div);
            }
            else{
                stack.push(Integer.parseInt(tokens[i]));
            }
        }
        return stack.peek();
    }
}
