class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        minsofar=float('inf')
        maxprofit=0
        for num in prices:
            minsofar=min(minsofar,num)
            maxprofit=max(maxprofit,num-minsofar)
        return maxprofit