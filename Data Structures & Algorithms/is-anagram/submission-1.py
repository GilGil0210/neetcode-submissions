class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        isSame = False
        if len(s) == len(t):
            for i in range(len(s)):
                if s[i] in t:
                    t = t.replace(s[i] , "" , 1)
                else:
                    isSame = False
                    break
        else:
            isSame = False

        if len(t) != 0:
            isSame = False
        else:
            isSame = True
        return isSame