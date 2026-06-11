class Solution:
    def carFleet(self, target: int, position: List[int], speed: List[int]) -> int:
        zipper=list(zip(position,speed))
        zipper.sort(reverse=True)
        stack=[]
        for p,s in zipper:
            time=(target-p)/s
            stack.append(time)
            if(len(stack)>1 and stack[-1]<=stack[-2]):
                stack.pop()
        return len(stack)


