class Solution:
    def twoSum(self, numbers: List[int], target: int) -> List[int]:
        dictionary={}
        for i in range(len(numbers)):
            comp=target-numbers[i]
            if comp in dictionary:
                return [dictionary[comp],i+1]
            else:
                dictionary[numbers[i]]=i+1
        return []