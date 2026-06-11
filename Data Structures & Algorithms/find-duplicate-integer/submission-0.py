class Solution:
    def findDuplicate(self, nums: List[int]) -> int:
        arr=[]
        for num in nums:
            if num in arr:
                return num
            arr.append(num)
        return -1

