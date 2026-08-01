class Solution:
    def findKthLargest(self, nums: List[int], k: int) -> int:
        nums1=[-x for x in nums]
        heapq.heapify(nums1)
        while k>0:
            mini=heapq.heappop(nums1)
            k-=1
        return -mini