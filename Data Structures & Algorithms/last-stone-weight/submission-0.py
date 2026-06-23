class Solution:
    def lastStoneWeight(self, stone: List[int]) -> int:
        stone=[-s for s in stone]
        heapq.heapify(stone)

        while len(stone)>1:
            first=heapq.heappop(stone)
            second=heapq.heappop(stone)
            if second>first:
                heapq.heappush(stone,first-second)
        stone.append(0)
        return abs(stone[0])
