class MinStack {
    Stack<Integer> stack;
    Stack<Integer> stack_min;
    public MinStack() {
        stack=new Stack<>();
        stack_min=new Stack<>();
    }
    public void push(int val) {
        stack.push(val);
        if(stack_min.isEmpty() || val<=stack_min.peek()){
            stack_min.push(val);
        }
    }
    
    public void pop() {
        if(stack.peek().equals(stack_min.peek())){
            stack_min.pop();
        }
        stack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return stack_min.peek();
    }
}

