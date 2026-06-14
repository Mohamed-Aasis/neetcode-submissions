class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        if not nums:
            return 0
        curr_maxi=maxi_so_far=nums[0]
        for i in range(1,len(nums)):
            curr_maxi=max(nums[i],curr_maxi+nums[i])
            maxi_so_far=max(curr_maxi,maxi_so_far)
        return maxi_so_far