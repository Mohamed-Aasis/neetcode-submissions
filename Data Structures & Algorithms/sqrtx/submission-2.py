class Solution:
    def mySqrt(self, x: int) -> int:
        def condition(num:int)->bool:
            return num*num>x
        l=0
        r=x+1
        while(l<r):
            mid=l+(r-l)//2
            if(condition(mid)):
                r=mid
            else:
                l=mid+1
            
        return l-1
            