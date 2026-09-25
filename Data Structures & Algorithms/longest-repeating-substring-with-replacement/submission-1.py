class Solution:
    def characterReplacement(self, s: str, k: int) -> int:
        count=[0]*26
        l=0
        maxfreq=0
        maxlength=0
        for r in range(len(s)):
            count[ord(s[r])-ord('A')]+=1
            maxfreq=max(maxfreq,count[ord(s[r])-ord('A')])
            while r-l+1-maxfreq>k:
                count[ord(s[l])-ord('A')]-=1
                l+=1
            maxlength=max(maxlength,r-l+1)
        return maxlength