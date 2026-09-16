class Solution:
    def isPalindrome(self, s: str) -> bool:
        the_str = ""
        for i in range(len(s)):
            if s[i].isalnum():
                the_str += s[i].lower()
        
        return the_str.lower() == the_str[::-1]