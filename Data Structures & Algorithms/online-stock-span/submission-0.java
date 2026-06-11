
class StockSpanner {
    // 1. Declare our Stack. 
    // We use int[] because we need to store TWO numbers: [price, span]
    Stack<int[]> stack;

    public StockSpanner() {
        // 2. Initialize the stack when the object is created
        stack = new Stack<>();
    }
    
    public int next(int price) {
        // 3. Every single day starts off with a span of 1 (just itself)
        int span = 1;
        
        // 4. THE PAC-MAN LOOP (Chain Reaction)
        // While the stack isn't empty, AND the price at the top of the stack (index 0) 
        // is LESS THAN OR EQUAL to today's price...
        while (!stack.isEmpty() && stack.peek()[0] <= price) {
            
            // ...we eat it! We pop it off, grab its span (index 1), and add it to our own.
            span += stack.pop()[1]; 
        }

        stack.push(new int[]{price, span});
        
        // 6. Return the span we just calculated!
        return span;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */