class Solution:
    def combinationSum(self, nums: List[int], target: int) -> List[List[int]]:
        res=[]
        subset=[]
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
            dfs(i,curr_sum)
            remove=subset.pop()
            curr_sum-=remove
            dfs(i+1,curr_sum)
        dfs(0,0)
        return res            