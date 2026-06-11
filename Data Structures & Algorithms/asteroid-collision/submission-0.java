class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        
        for (int i = 0; i < asteroids.length; i++) {
            int current = asteroids[i];
            boolean survived = true; 
            
            while (!stack.isEmpty() && stack.peek() > 0 && current < 0) {
                if (stack.peek() < Math.abs(current)) {
                    stack.pop();
                } 
                else if (stack.peek() == Math.abs(current)) {
                    stack.pop(); 
                    survived = false; 
                    break; 
                } 
                else {
                    survived = false; 
                    break; 
                }
            }
            
            if (survived) {
                stack.push(current);
            }
        } 
        
        int[] result = new int[stack.size()];
        for (int j = 0; j < stack.size(); j++) {
            result[j] = stack.get(j);
        }
        
        return result; 
    }
}