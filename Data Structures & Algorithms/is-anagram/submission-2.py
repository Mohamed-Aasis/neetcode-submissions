class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        s1=[0]*26
        t1=[0]*26
        for ch in s:
            s1[ord(ch)-97]+=1
        for ch in t:
            t1[ord(ch)-97]+=1
        for i in range(len(t1)):
            if s1!=t1:
                return False
        return True
        