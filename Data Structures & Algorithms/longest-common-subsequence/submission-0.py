class Solution:
    def longestCommonSubsequence(self, str1: str, str2: str) -> int:
        n=len(str1)
        m=len(str2)
        dp=[[-1 for _ in range(len(str2))] for _ in range(len(str1))]
        def dfs(i,j):
            if i>=n or j>=m:
                return 0
            if dp[i][j]!=-1:
                return dp[i][j]
            if str1[i]==str2[j]:
                dp[i][j]=1+dfs(i+1,j+1)
            else:
                dp[i][j]=max(dfs(i+1,j),dfs(i,j+1))
            return dp[i][j]
        return dfs(0,0)