class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        l=0
        maxlen=0
        hm={}
        if len(s)==1:
            return 1
        for r in range(l,len(s)):
            if s[r] in s[l:r]:
                maxlen=max(maxlen,r-l)
                l=hm.get(s[r])+1
                hm[s[r]]=r
            else:
                hm[s[r]]=r
                maxlen=max(maxlen,r-l+1)
        return maxlen


