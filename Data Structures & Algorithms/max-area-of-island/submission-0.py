class Solution:
    def maxAreaOfIsland(self, grid: List[List[int]]) -> int:
        row=len(grid)
        col=len(grid[0])
        maxSize=0
        direc=[[1,0],[-1,0],[0,1],[0,-1]]
        def dfs(r,c):
            if r<0 or c<0 or r>=row or c>=col or grid[r][c]==0:
                return 0
            grid[r][c]=0
            area=1
            for dr,dc in direc:
                area+=dfs(r+dr,c+dc)
            return area

        for r in range(row):
            for c in range(col):
                maxSize=max(dfs(r,c),maxSize)
        return maxSize