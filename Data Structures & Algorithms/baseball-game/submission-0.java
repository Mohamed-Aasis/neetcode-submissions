class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack=new Stack<>();
        int sum=0;
        for(String op:operations){
            if(op.equals("C")){
                stack.pop();
            }
            else if(op.equals("D")){
                stack.push(2*stack.peek());
            }
            else if(op.equals("+")){
                int top=stack.pop();
                int top_afterpop=stack.peek();
                stack.push(top);
                stack.push(top+top_afterpop);
            }
            else{
                stack.push(Integer.parseInt(op));
            }
        }
        for(int i:stack){
            sum+=i;
        }
        return sum;
    }
}