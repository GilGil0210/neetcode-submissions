class Solution:
    def lengthOfLastWord(self, s: str) -> int:
        s = s.strip()
        convert = s.split(" ")
        count = 0
        for i in convert[-1]:
            count+=1
        return count