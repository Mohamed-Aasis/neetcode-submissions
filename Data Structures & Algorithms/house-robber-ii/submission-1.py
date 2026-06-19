class Solution:
    def rob(self, num: List[int]) -> int:
        if len(num)==1:
            return num[0]
        if len(num)==2:
            return max(num[0],num[1])
        def timeline(nums):
            dp=[-1]*len(nums)
            def dfs(i):
                if i>=len(nums):
                    return 0
                if dp[i]!=-1:
                    return dp[i]
                take=nums[i]+dfs(i+2)
                skip=dfs(i+1)
                dp[i]=max(take,skip)
                return dp[i]
            
            return dfs(0) 
        timelineA=timeline(num[:len(num)-1])
        timelineB=timeline(num[1:])
        return max(timelineA,timelineB)