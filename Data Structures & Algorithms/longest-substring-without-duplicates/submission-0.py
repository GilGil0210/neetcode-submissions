class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        res = 0
        i = 0
        while i < len(s):
            the_check = set()
            for j in range(i , len(s)):
                if s[j] not in the_check:
                    the_check.add(s[j])
                else:
                    break
            i +=1
            res = max(res, len(the_check))
        return res