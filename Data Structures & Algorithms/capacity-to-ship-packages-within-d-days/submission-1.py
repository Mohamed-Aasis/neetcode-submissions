class Solution:
    def shipWithinDays(self, weights: List[int], days: int) -> int:
        def condition(capacity)->bool:
            max_capacity=0
            total_days=1
            for weight in weights:
                if weight+max_capacity>capacity:
                    total_days+=1
                    max_capacity=weight
                else:
                    max_capacity+=weight
            return total_days<=days
        l=max(weights)
        r=sum(weights)
        while(l<r):
            mid=l+(r-l)//2
            if(condition(mid)):
                r=mid
            else:
                l=mid+1
        return l
