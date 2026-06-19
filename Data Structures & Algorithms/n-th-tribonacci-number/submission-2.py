class Solution:
    def tribonacci(self, n: int) -> int:
        dp=[-1]*(n+1)
        def tribo(i):
            if i==0:
                return 0
            if i<3:
                return 1
            if dp[i]!=-1:
                return dp[i]
            dp[i]=tribo(i-1)+tribo(i-2)+tribo(i-3)
            return dp[i]
        return tribo(n)