class Solution:
    def search(self, nums: list[int], target: int) -> int:
        
        # --- THE CUSTOM LOGIC ---
        def condition(m: int) -> bool:
            # Which half are we in?
            target_is_on_left = target >= nums[0]
            mid_is_on_left = nums[m] >= nums[0]
            
            if target_is_on_left == mid_is_on_left:
                # We are on the same half! Normal binary search works here.
                return nums[m] >= target
            else:
                # We are on different halves! 
                # If target is on the left, we MUST go left (return True).
                # If target is on the right, we MUST go right (return False).
                return target_is_on_left

        # --- THE ULTIMATE TEMPLATE ---
        l, r = 0, len(nums)
        
        while l < r:
            m = l + (r - l) // 2
            
            if condition(m):
                r = m
            else:
                l = m + 1
                
        # Did we find it?
        if l < len(nums) and nums[l] == target:
            return l
            
        return -1