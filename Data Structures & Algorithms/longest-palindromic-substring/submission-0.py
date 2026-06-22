class Solution:
    def longestPalindrome(self, s: str) -> str:
        memo={}
        def dfs(l,h):
            if l>=h:
                return True
            if (l,h) in memo:
                return memo[(l,h)]
            if s[l]==s[h]:
                memo[(l,h)]=dfs(l+1,h-1)
            else:
                memo[(l,h)]=False
            return memo[(l,h)]
        lonsub=""
        maxlen=0
        for i in range(len(s)):
            for j in range(i,len(s)):
                if dfs(i,j):
                    currlen=j-i+1
                    if maxlen<currlen:
                        maxlen=currlen
                        lonsub=s[i:j+1]
        return lonsub 


            
