class Solution:
    def firstUniqChar(self, s: str) -> int:
        dictionary={}
        for i in range(len(s)):
            dictionary[s[i]]=dictionary.get(s[i],0)+1
        for i in range(len(s)):
            if dictionary[s[i]]==1:
                return i
        return -1