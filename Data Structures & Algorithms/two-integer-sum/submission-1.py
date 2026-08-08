class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        hm={}
        lists=[]
        for i in range(len(nums)):
            comp=target-nums[i]
            if comp in hm:
                lists.append(hm[comp])
                lists.append(i)
            else:
                hm[nums[i]]=i
        return lists

            