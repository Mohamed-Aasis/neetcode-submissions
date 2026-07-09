class Solution:
    def minPathSum(self, grid: List[List[int]]) -> int:
        m=len(grid)
        n=len(grid[0])
        dp=[[-1 for _ in range(len(grid[0]))] for _ in range(len(grid))]
        def dfs(i,j):
            if i>=m or j>=n:
                return float('inf')
            if i==m-1 and j==n-1:
                return grid[i][j]
            if dp[i][j]!=-1:
                return dp[i][j]
            right=dfs(i,j+1)
            down=dfs(i+1,j)
            dp[i][j]=grid[i][j]+min(right,down)
            return dp[i][j]
        return dfs(0,0)

                

        