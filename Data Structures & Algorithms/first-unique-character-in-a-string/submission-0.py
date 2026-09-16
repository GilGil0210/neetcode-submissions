class Solution:
    def firstUniqChar(self, s: str) -> int:
        output = None
        for i in range(len(s)):
            if s.count(s[i]) == 1:
                output = i
                break
        if output == None:
            return -1
        return output