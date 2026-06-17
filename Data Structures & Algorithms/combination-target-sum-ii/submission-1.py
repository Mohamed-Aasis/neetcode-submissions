class Solution:
    def combinationSum2(self, nums: List[int], target: int) -> List[List[int]]:
        res=[]
        subset=[]
        nums.sort()
        def dfs(i,curr_sum):
            if curr_sum==target:
                res.append(subset[:])
                return 
            if curr_sum>target:
                return
            if i>=len(nums):
                return
            subset.append(nums[i])
            curr_sum+=nums[i]
            dfs(i+1,curr_sum)
            remove=subset.pop()
            curr_sum-=remove
            while i + 1 < len(nums) and nums[i] == nums[i+1]:
                i += 1
            dfs(i+1,curr_sum)
        dfs(0,0)
        return res            