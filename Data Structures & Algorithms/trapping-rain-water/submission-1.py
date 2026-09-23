class Solution:
    def trap(self, height: List[int]) -> int:
        l=0
        r=len(height)-1
        maxleft=0
        maxright=0
        sumation=0
        while l<=r:
            if height[l]<height[r]:
                maxleft=max(maxleft,height[l])
                sumation+=maxleft-height[l]
                l+=1
            else:
                maxright=max(maxright,height[r])
                sumation+=maxright-height[r]
                r-=1
        return sumation