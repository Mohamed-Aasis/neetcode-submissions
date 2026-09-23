class Solution:
    def containsNearbyDuplicate(self, nums: List[int], k: int) -> bool:
        check=set()
        l=0
        for r in range(len(nums)):
            if r-l>k:
                check.remove(nums[l])
                l+=1
            if r-l<=k and nums[r] in check:
                return True
            check.add(nums[r])
        return False
            
        