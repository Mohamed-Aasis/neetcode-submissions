class Solution:
    def coinChange(self, coins: List[int], amount: int) -> int:
        memo = {}
        def dfs(rem):
            if rem < 0:
                return float('inf')  
            if rem == 0:
                return 0             
            if rem in memo:
                return memo[rem]
                
            min_coins = float('inf')
            
            for coin in coins:
                result = dfs(rem - coin)
                
                if result != float('inf'):
                    min_coins = min(min_coins, result + 1)
        
            memo[rem] = min_coins
            return memo[rem]
            
        ans = dfs(amount)
        return ans if ans != float('inf') else -1