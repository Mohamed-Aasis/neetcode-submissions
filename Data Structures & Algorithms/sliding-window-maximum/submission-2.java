

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        // Your exact correct math for the result array size!
        int[] result = new int[nums.length - k + 1];
        int resultIndex = 0;
        
        // Our Deque will store INDICES, not the actual numbers.
        Deque<Integer> deque = new ArrayDeque<>();
        
        for (int right = 0; right < nums.length; right++) {
            
            // 1. Clean the Front (The Expiration Check)
            // Is the index at the front of the deque too old? (It fell out the left side of the window)
            // The math 'right - k + 1' calculates the current 'left' boundary of our window.
            if (!deque.isEmpty() && deque.peekFirst() < right - k + 1) {
                deque.pollFirst(); // Kick it out!
            }
            
            // 2. Clean the Back (The Useless Check)
            // Are the numbers at the back of the deque smaller than the new number we are adding?
            // If yes, they are completely useless forever. Kick them out!
            while (!deque.isEmpty() && nums[deque.peekLast()] < nums[right]) {
                deque.pollLast(); 
            }
            
            // Add the new number's index to the back of the deque
            deque.offerLast(right);
            
            // 3. Record the Max
            // Have we finally built a window of at least size 'k'? 
            if (right >= k - 1) {
                // The biggest valid number is ALWAYS sitting right at the front!
                result[resultIndex] = nums[deque.peekFirst()];
                resultIndex++;
            }
        }
        
        return result;
    }
}